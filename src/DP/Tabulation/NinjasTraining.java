package DP.Tabulation;

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

    public static int ninjaTraining(int n, int points[][]) {
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task <= 2; task++) {
                    if (task != last) {
                        int activity = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
                }
            }
        }
        return dp[n - 1][3];
    }

}
