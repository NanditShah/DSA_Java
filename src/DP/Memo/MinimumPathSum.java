package DP.Memo;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        System.out.println("Minimum Path Sum");
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };


        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] arr : dp) Arrays.fill(arr,-1);

        dp[0][0] = grid[0][0];
        return find(m - 1,n - 1,dp,grid,m,n);
    }

    public static int find(int x,int y,int[][] dp,int[][] grid,int m,int n){

        if(x == 0 && y == 0 || dp[x][y] != -1)
            return dp[x][y];

        int top = Integer.MAX_VALUE;
        if(x > 0)
            top = Math.min(top,grid[x][y]+find(x-1,y,dp,grid,m,n));

        int left = Integer.MAX_VALUE;
        if(y > 0)
            left = Math.min(top,grid[x][y]+find(x,y-1,dp,grid,m,n));

        dp[x][y] = Math.min(top,left);
        return dp[x][y];
    }
}
