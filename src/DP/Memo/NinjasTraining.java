package DP.Memo;

import java.util.Arrays;

public class NinjasTraining {
    public static void main(String[] args) {
        System.out.println("Ninja’s Training");
        int[][] grid = {
                {1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}
        };

        System.out.println(ninjaTraining(grid.length,grid) == 11);


        int[][] grid2 = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        System.out.println(ninjaTraining(grid2.length,grid2) == 210);

        int[][] grid3 = {
                {18, 11, 19},
                {4, 13, 7},
                {1, 8, 13}
        };
        System.out.println(ninjaTraining(grid3.length,grid3) == 45);

        int[][] grid4 = {
                {10, 50, 1},
                {5, 100, 11}
        };

        System.out.println(ninjaTraining(grid4.length,grid4) == 110);
    }

    static int ninjaTraining(int n, int[][] points) {
        int dp[][] = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return f(n - 1, 3, points, dp);
    }

    static int f(int day, int last, int[][] points, int[][] dp) {
        if (dp[day][last] != -1) return dp[day][last];

        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maxi = Math.max(maxi, points[0][i]);
            }
            return dp[day][last] = maxi; // Store and return the result
        }

        int maxi = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity); // Update the maximum points
            }
        }

        return dp[day][last] = maxi; // Store and return the result
    }
}
