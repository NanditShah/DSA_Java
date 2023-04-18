package Assignments.Graphs;

public class NumberOfEnclaves {
    public static void main(String[] args) {
        System.out.println("Number of Enclaves");
    }

    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] visited = new int[m][n];

        for(int i = 0;i<m;i++){
            if(grid[i][0] == 1 && visited[i][0] == 0){
                dfs(grid,visited,i,0);
            }

            if(grid[i][n-1] == 1 && visited[i][n-1] == 0){
                dfs(grid,visited,i,n-1);
            }
        }

        for(int i = 0;i<n;i++){
            if(grid[0][i] == 1 && visited[0][i] == 0){
                dfs(grid,visited,0,i);
            }
            if(grid[m-1][i] == 1 && visited[m-1][i] == 0){
                dfs(grid,visited,m-1,i);
            }
        }

        int count = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(visited[i][j] == 0 && grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
    }
    private static final int[] dirs = {0, 1, 0, -1, 0};
    private void dfs(int[][] grid, int[][] visited, int i, int j) {
        visited[i][j] = 1;
        int m = grid.length;
        int n = grid[0].length;


        for(int k = 0;k<4;k++){
            int ki = i+dirs[k];
            int kj = j+dirs[k+1];

            if(ki >= 0 && ki < m && kj >= 0 && kj < n && visited[ki][kj] == 0 && grid[ki][kj] == 1){
                dfs(grid,visited,ki,kj);
            }
        }
    }

}
