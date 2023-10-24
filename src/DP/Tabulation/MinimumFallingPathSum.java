package DP.Tabulation;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };


        int[][] matrix1 = {
                {-19, 57},
                {-40, -5}
        };

        System.out.println(minFallingPathSum(matrix1));

        System.out.println("Minimum Falling Path Sum");
    }

    static int[][] dirs = {{-1,-1},{-1,0},{-1,1}};

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int ans = Integer.MAX_VALUE;

        int[][] dp = new int[n][n];

        for(int i = 0;i<n;i++)
            dp[0][i] = matrix[0][i];

        for(int i = 1;i<n;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int[] dir : dirs){
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if(x >= 0 && y >= 0 && x < n && y < n)
                        dp[i][j] = Math.min(dp[i][j],matrix[i][j]+dp[x][y]);
                }
            }
        }

        for(int num : dp[n - 1]) ans = Math.min(ans,num);

        return ans;
//        for(int i = 0;i<n;i++){
//            if(i == n - 1){
//                for(int j = 0;j<n;j++) dp[i][j] = matrix[i][j];
//            }else Arrays.fill(dp[i],-1);
//        }

//        for(int i = 0;i<n;i++){
//            ans = Math.min(ans,calculate(0,i,dp,matrix,n));
//        }
//        return ans;
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
