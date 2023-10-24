package DP.Tabulation;

import java.util.Arrays;

public class Kanpsack01 {
    public static void main(String[] args) {
        System.out.println("0/1 Knapsack");

        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        System.out.println(knapsack(weights, values, capacity)); // Expected output: 7

        int[] weights2 = {10, 20, 30 };
        int[] values2 = {60, 100, 120};
        int capacity2 = 50;
        System.out.println(knapsack(weights2, values2, capacity2)); // Expected output: 220

        int[] weights3 = {1, 2, 4, 5};
        int[] values3 = {5, 4, 8, 6};
        int capacity3 = 5;
        System.out.println(knapsack(weights3, values3, capacity3)); // Expected output: 13
    }

    public static int knapsack(int[] weights,int[] values,int capacity){
        if(capacity == 0 || weights.length == 0) return 0;
        int n = weights.length;

        int[][] dp = new int[n][capacity+1];

        for(int i = 0;i<n;i++) dp[i][0] = 0;
        for(int j = weights[0];j<=capacity;j++) dp[0][j] = values[0];


        for(int i = 1;i<n;i++){
            for(int j = 0;j<=capacity;j++){
                int notTake = 0+dp[i - 1][j];
                int take = Integer.MIN_VALUE;
                if(weights[i] <= j) take = values[i] + dp[i-1][j - weights[i]];
                dp[i][j] = Math.max(notTake,take);
            }
        }

        return dp[n-1][capacity];
    }
}
