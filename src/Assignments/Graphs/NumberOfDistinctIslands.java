package Assignments.Graphs;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberOfDistinctIslands {
    public static void main(String[] args) {
        System.out.println("Number of Distinct Islands");
    }

    public int distinctCounts(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int[][] visited = new int[m][n];
        HashSet<ArrayList<String>> distinctIslands = new HashSet<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(visited[i][j] == 0 && grid[i][j] == 1){
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i,j,grid,visited,list,i,j);
                    distinctIslands.add(list);
                }
            }
        }
        return distinctIslands.size();

    }

    private static final int[] dirs = {0, 1, 0, -1, 0};
    private void dfs(int i, int j, int[][] grid, int[][] visited, ArrayList<String> list, int row, int col) {
        int m = grid.length;
        int n = grid.length;

        visited[i][j] = 1;
        list.add(toString(i - row,j - col));

        for(int k = 0;k<4;k++){
            int krow = i +dirs[k];
            int kcol = j + dirs[k+1];

            if(krow >= 0 && krow < m && kcol >= 0 && kcol < n && visited[krow][kcol] == 0 && grid[krow][kcol] == 1){
                dfs(krow,kcol,grid,visited,list,row,col);
            }
        }
    }

    private String toString(int num1,int num2){
        return Integer.toString(num1)+" "+Integer.toString(num2);
    }
}
