package DP.Memo;

public class MaxPathSum {
    public static void main(String[] args) {
        System.out.println("max path sum");
        int[][] grid = {
                {1, 3, 12},
                {5, 1, 1},
                {3, 6, 1}
        };

        System.out.println(maxPathSum(grid));
    }

    public static int maxPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] memo = new int[m][n];

//        Base case
        memo[m - 1][n - 1] = grid[m - 1][n - 1];

        return dp(0,0,memo,grid,m,n);
    }

    static int[][] dirs = {{0,1},{1,0}};

    private static int dp(int x, int y, int[][] memo, int[][] grid, int m, int n) {
        if(x < 0 || x >= m || y < 0 || y >= n) return 0;

        if(memo[x][y] > 0) return memo[x][y];

        int ans = 0;
        for(int dir[] : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];

            ans = Math.max(ans,dp(_x,_y,memo,grid,m,n));
        }
        memo[x][y] = grid[x][y] + ans;

        return memo[x][y];
    }

}
