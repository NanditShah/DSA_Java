package DSASheet.DFS.Hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MakingALargeIsland {
    public static void main(String[] args) {
        System.out.println("Making A Large Island");
        int[][] lsland = {{1,0},{0,1}};
        int area = largestIsland(lsland);
        System.out.println(area);
    }

    static int colorIndex = 2;
    static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static int largestIsland(int[][] grid) {
        int n = grid.length;

        int[] areaByColor = new int[n*n+2];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                    areaByColor[colorIndex] = dfs(grid,i,j);
                    colorIndex++;
                }
            }
        }

        System.out.println(Arrays.toString(areaByColor));
        boolean hasZero = false;
        int largestArea = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0){
                    hasZero = true;
                    Set<Integer> colorSet = new HashSet<>();
                    if (i > 0) colorSet.add(grid[i - 1][j]);
                    if (j > 0) colorSet.add(grid[i][j - 1]);
                    if (i < n - 1) colorSet.add(grid[i + 1][j]);
                    if (j < n - 1) colorSet.add(grid[i][j + 1]);

                    int area = 1;
                    for (int k : colorSet)
                        area += areaByColor[k];

                    largestArea = Math.max(largestArea, area);
                }
            }
        }
        return hasZero ? largestArea : n*n;
    }
    public static int dfs(int[][] grid,int i,int j){
        int n = grid.length;
        if(i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) return 0;
        grid[i][j] = colorIndex;
        int area = 1;
        for(int[] dir : dirs){
            area += dfs(grid,i+dir[0],j+dir[1]);
        }
        return area;
    }
}

