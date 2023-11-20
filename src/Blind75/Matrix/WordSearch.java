package Blind75.Matrix;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println("Word Search");
    }

    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean[][] visited;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(word.charAt(0) == board[i][j]){
                    visited = new boolean[m][n];
                    visited[i][j] = true;
                    if(searchWordWithDFS(i,j,0,board,word,visited)) return true;
                }
            }
        }

        return false;
    }

    private boolean searchWordWithDFS(int x, int y, int wordIndex, char[][] board,String word,boolean[][] visited) {
        if(board[x][y] != word.charAt(wordIndex)) return false;
        if(wordIndex == word.length() - 1) return true;

        boolean ans = false;
        for(int[] dir : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];


            if(_x >= 0 && _x < board.length && _y >= 0 && _y < board[0].length
                    && !visited[_x][_y] && board[_x][_y] == word.charAt(wordIndex+1)){
                visited[_x][_y] = true;
                ans = ans || searchWordWithDFS(_x,_y,wordIndex+1,board,word,visited);;
                visited[_x][_y] = false;
            }
        }
        return ans;
    }
}


class Solution {

}