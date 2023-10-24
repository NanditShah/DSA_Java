package DP.Tabulation;

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

        for(int x = 0;x < m;x++){
            for(int y = 0; y < n; y++){
                if(x == 0 && y == 0) {
                    dp[x][y] = grid[x][y];
                    continue;
                }

                int down = Integer.MAX_VALUE;
                if(x > 0)
                    down = grid[x][y] + dp[x - 1][y];

                int right = Integer.MAX_VALUE;
                if(y > 0)
                    right = grid[x][y] + dp[x][y-1];

                dp[x][y] = Math.min(right, down);
            }
        }

        return dp[m - 1][n - 1];
    }
}
