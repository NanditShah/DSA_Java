package DP.Memo;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        System.out.println("Minimum Falling Path Sum");
        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        int[][] matrix1 = {
                {-19, 57},
                {-40, -5}
        };


        System.out.println(minFallingPathSum(matrix));
    }

    static int[][] dirs = {{1,-1},{1,0},{1,1}};
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int ans = Integer.MAX_VALUE;

        int[][] dp = new int[n][n];

        for(int i = 0;i<n;i++){
            if(i == n - 1){
                for(int j = 0;j<n;j++) dp[i][j] = matrix[i][j];
            }else Arrays.fill(dp[i],-1);
        }

        for(int i = 0;i<n;i++){
            ans = Math.min(ans,calculate(0,i,dp,matrix,n));
        }
        return ans;
    }

    public static int calculate(int x,int y,int[][] dp,int[][] matrix,int n){
        if(x < 0 || y < 0 || x >= n || y >= n) {
            return Integer.MAX_VALUE;
        }

        if(x == n - 1 || dp[x][y] != -1) return dp[x][y];

        int ans = Integer.MAX_VALUE;
        for(int[] dir : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];

            if(_x >= 0 && _y >= 0 && _x < n && _y < n){
                ans = Math.min(ans,matrix[x][y]+calculate(_x,_y,dp,matrix,n));
            }
        }
        dp[x][y] = ans;

        return dp[x][y];
    }
}
