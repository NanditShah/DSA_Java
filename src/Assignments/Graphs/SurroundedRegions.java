package Assignments.Graphs;

public class SurroundedRegions {
    public static void main(String[] args) {
        System.out.println("Surrounded Regions");
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] visited = new int[m][n];

        for(int i = 0;i<m;i++){
            if(board[i][0] == 'O' && visited[i][0] == 0){
                dfs(board,visited,i,0);
            }

            if(board[i][n-1] == 'O' && visited[i][n-1] == 0){
                dfs(board,visited,i,n-1);
            }
        }

        for(int i = 0;i<n;i++){
            if(board[0][i] == 'O' && visited[0][i] == 0){
                dfs(board,visited,0,i);
            }
            if(board[m-1][i] == 'O' && visited[m-1][i] == 0){
                dfs(board,visited,m-1,i);
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(visited[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};
    private void dfs(char[][] board, int[][] visited, int i, int j) {
        visited[i][j] = 1;
        int m = board.length;
        int n = board[0].length;


        for(int k = 0;k<4;k++){
            int ki = i+dirs[k];
            int kj = j+dirs[k+1];

            if(ki >= 0 && ki < m && kj >= 0 && kj < n && visited[ki][kj] == 0 && board[ki][kj] == 'O'){
                dfs(board,visited,ki,kj);
            }
        }
    }
}
