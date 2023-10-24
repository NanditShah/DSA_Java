package DP.Tabulation;

import java.util.Arrays;

public class CoinChangeII {
    public static void main(String[] args) {
        System.out.println("Coin Change II");
    }
    
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int i = 0;i<n;i++) dp[i][0] = 1;
        for(int i = coins[0];i<=amount;i++) dp[0][i] = i % coins[0] == 0 ? 1 : 0;

        for(int i = 1;i<n;i++){
            for(int j = 1;j<=amount;j++){
                int dontPick = dp[i - 1][j];
                int pick = 0;
                if(coins[i] <= j) pick = dp[i][j - coins[i]];
                dp[i][j] = dontPick + pick;
            }
        }
        return dp[n-1][amount];
    }
}
