package DP.Tabulation;

public class CountSquareSubmatricesWithAllOnes {
    public static void main(String[] args) {
        System.out.println("Count Square Submatrices with All Ones");
    }

    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];

        for(int i = 0;i<m;i++) dp[i][0] = matrix[i][0];
        for(int j = 0;j<n;j++) dp[0][j] = matrix[0][j];

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j] == 0) continue;
                dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
            }
        }

        int totalWays = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++) totalWays += dp[i][j];
        }

        return totalWays;

    }
}
