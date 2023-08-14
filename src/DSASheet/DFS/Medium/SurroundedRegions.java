package DSASheet.DFS.Medium;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        System.out.println("Surrounded Regions");
        char[][] board = {
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X'}
        };

        solve(board);
        printBoard(board);
    }

    public static void solve(char[][] board) {
        int m = board.length;
        int  n = board[0].length;

        for(int i =0;i<n;i++){
            if(board[0][i] == 'O'){
                dfs(board,0,i,'T');
            }
            if(board[m-1][i] == 'O'){
                dfs(board,m-1,i,'T');
            }
        }

        for(int i =0;i<m;i++){
            if(board[i][0] == 'O'){
                dfs(board,i,0,'T');
            }
            if(board[i][n-1] == 'O'){
                dfs(board,i,n-1,'T');
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == 'T') board[i][j] = 'O';
            }
        }
    }

    static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static void dfs(char[][] board,int x,int y,char sign){
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] != 'O') return;
        board[x][y]  = sign;
        for(int[] dir : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];
            dfs(board,_x,_y,sign);
        }
    }

    public static void printBoard(char[][] board){
        for(char[] signs: board){
            System.out.print(Arrays.toString(signs));
        }
    }

}
