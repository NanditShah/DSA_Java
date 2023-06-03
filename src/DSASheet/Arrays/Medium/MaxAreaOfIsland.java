package DSASheet.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        System.out.println("Max Area of Island");

        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(maxAreaOfIsland(grid));
    }

    private static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public static int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int area = 0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    ArrayList<Integer> elements = new ArrayList<>();
                    dfs(i,j,visited,grid,elements);
                    area = Math.max(area,elements.size());
                }
            }
        }
        return area;
    }

    private static void dfs(int i,int j,boolean[][] visited,int[][] grid,ArrayList<Integer> elements){
        visited[i][j] = true;
        elements.add(grid[i][j]);
        for(int[] dir : dirs){
            int newI = i + dir[0];
            int newJ = j + dir[1];

            if(newI >= 0 && newI < grid.length && newJ >= 0 && newJ < grid[0].length && grid[newI][newJ] == 1  && !visited[newI][newJ]){
                dfs(newI,newJ,visited,grid,elements);
            }
        }
    }
}
