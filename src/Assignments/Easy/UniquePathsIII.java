package Assignments.Easy;

import java.util.Arrays;

public class UniquePathsIII {
    public static void main(String[] args) {
        System.out.println("Unique Paths III");
//        int[][] grid = {{1,0,0,0},{0,0,0,0},{0,0,0,2}};
        int[][] grid = {{1},{2}};
        System.out.println(uniquePathsIII(grid));


    }

    static int uniquePathsIII(int[][] grid) {
        int[] startIndex = {-1,-1};
        int requiredSteps = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    startIndex[0] = i;
                    startIndex[1] = j;
                    grid[i][j] = 0;
                }
                if(grid[i][j] != -1){
                    requiredSteps += 1;
                }
            }
        }

        int totalPaths = getTotalPathCount(grid,startIndex[0],startIndex[1],requiredSteps,0);
        return totalPaths;
    }

    static int getTotalPathCount(int[][] grid,int r,int c,int requiredSteps,int steps){
        if(grid[r][c] == 2){
            if(steps == requiredSteps -1){
                return 1;
            }
            return 0;
        }
        if(grid[r][c] == -1 || grid[r][c] == 1){
            return 0;
        }

        int count = 0;
        grid[r][c] = 1;
        if(r > 0){
            count += getTotalPathCount(grid,r-1,c,requiredSteps,steps+1);
        }
        if(r < grid.length - 1){
            count += getTotalPathCount(grid,r+1,c,requiredSteps,steps+1);
        }
        if(c > 0){
            count += getTotalPathCount(grid,r,c-1,requiredSteps,steps+1);
        }
        if(c < grid[0].length - 1){
            count += getTotalPathCount(grid,r,c+1,requiredSteps,steps+1);

        }
        grid[r][c] = 0;

        return count;
    }
}
