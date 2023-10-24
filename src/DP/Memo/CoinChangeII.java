package DP.Memo;

import java.util.Arrays;
import java.util.HashMap;

public class CoinChangeII {
    public static void main(String[] args) {
        System.out.println("Coin Change II");
    }

    public int findWays(int ind, int amount,int[] coins,int[][] dp) {
        if(ind == 0) {
            if(amount % coins[0] == 0) return 1;
            else return 0;
        }
        if(dp[ind][amount] != -1) return dp[ind][amount];
        int dontPick = 0 + findWays(ind-1,amount - 0 , coins , dp);

        int pick = 0;
        if(coins[ind] <= amount) pick = findWays(ind,amount-coins[ind],coins ,dp);

        return dp[ind][amount] = dontPick + pick;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for(int[] arr : dp) Arrays.fill(arr,-1);
        return findWays(n-1,amount,coins,dp);
    }
}
