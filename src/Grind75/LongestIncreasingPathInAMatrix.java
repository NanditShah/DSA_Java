package Grind75;

import java.util.Arrays;

public class LongestIncreasingPathInAMatrix {
    public static void main(String[] args) {
        System.out.println("Longest Increasing Path in a Matrix");

        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };

        int ans = longestIncreasingPath(matrix);
        System.out.println(ans);
    }

    public static int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++)
            Arrays.fill(dp[i],-1);

        int maxPathSize = Integer.MIN_VALUE;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(dp[i][j] == -1)
                    dp[i][j] = calculatePathSize(i,j,m,n,matrix,dp);
                maxPathSize = Math.max(maxPathSize,dp[i][j]);
            }
        }

        return maxPathSize;
    }

    static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    private static int calculatePathSize(int x, int y, int m, int n, int[][] matrix, int[][] dp) {
        if(x < 0 || y < 0 || x >= m || y >= n) return 0;

        if(dp[x][y] != -1) return dp[x][y];

        int path = 1;

        for(int[] dir : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];

            if(_x >= 0 && _y >= 0 && _x < m && _y < n && matrix[_x][_y] > matrix[x][y])
                path = Math.max(path,1+calculatePathSize(_x,_y,m,n,matrix,dp));
        }
        dp[x][y] = path;
        return path;
    }
}
