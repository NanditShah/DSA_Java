package DSASheet.Arrays.Medium;

public class WordSearch {
    public static void main(String[] args) {
        System.out.println("Word Search");
        char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        boolean ans = exist(board,"ABCCED");
        System.out.println(ans);
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length,n = board[0].length;
        char[] wordArr = word.toCharArray();
        boolean[][] visited;

        for(int i =0;i<m;i++){
            for(int j =0;j< n;j++){
                if(board[i][j] == wordArr[0]){
                    visited = new boolean[m][n];
                    boolean foundAns = backtracking(i,j,0,board,m,n,wordArr,visited);
                    if(foundAns == true) return true;
                }
            }
        }
        return false;
    }

    private static boolean backtracking(int i, int j,int currIndex,char[][] board,int m,int n,  char[] wordArr, boolean[][] visited) {
        if(currIndex == wordArr.length) return true;
        if(i < 0 || i >= m || j < 0 || j >= n) return false;
        if(visited[i][j]) return false;
        if(board[i][j] != wordArr[currIndex]) return false;

//        Backtracking
        visited[i][j] = true;
        boolean up = backtracking(i - 1,j,currIndex+1,board,m,n,wordArr,visited);
        boolean down =  backtracking(i + 1,j,currIndex+1,board,m,n,wordArr,visited);
        boolean left =  backtracking(i,j-1,currIndex+1,board,m,n,wordArr,visited);
        boolean right =  backtracking(i ,j+1,currIndex+1,board,m,n,wordArr,visited);
        System.out.println(up+" "+down+" "+left+" "+right);

        boolean ans = up || down || left || right;

        if(!ans){
            visited[i][j] = false;
        }
        return ans;
    }
}
