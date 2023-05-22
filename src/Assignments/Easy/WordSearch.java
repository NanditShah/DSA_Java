package Assignments.Easy;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println("Word Search");
        char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        boolean ans = exist(board,"ABCCED");
        System.out.println(ans);
    }

    static char[][] matrix;
    static char[] letters;
    static boolean[][] visited;

    static boolean exist(char[][] board, String word) {
        int m = board.length,n = board[0].length;
        letters = word.toCharArray();
        matrix = board;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == letters[0]) {
                    visited = new boolean[m][n];
                    boolean ans = findWord(i, j, 0);
                    if (ans == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean findWord(int currRow,int currCol,int currIndex){
        // Base cases
        if(currIndex == letters.length) return true;
        if(currRow < 0 || currRow >= matrix.length) return false;
        if(currCol < 0 || currCol >= matrix[0].length) return false;
        if(visited[currRow][currCol] == true) return false;
        if(matrix[currRow][currCol] != letters[currIndex]) return false;

//        Backtracking
        visited[currRow][currCol] = true;
        boolean up = findWord(currRow - 1,currCol,currIndex+1);
        boolean down = findWord(currRow + 1,currCol,currIndex+1);
        boolean left = findWord(currRow  ,currCol-1,currIndex+1);
        boolean right = findWord(currRow ,currCol+1,currIndex+1);

        System.out.println(up+" "+down+" "+left+" "+right);
        boolean ans = up || down || left || right;

        if(!ans){
            visited[currRow][currCol] = false;
        }
        return ans;
    }
}
