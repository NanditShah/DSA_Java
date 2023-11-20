package DP.Tabulation;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock III");
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        if(n == 2) Math.max(prices[1] - prices[0],0);
        int transactionLimit  = 2;

        int[][] current = new int[2][transactionLimit+1];
        int[][] after = new int[2][transactionLimit+1];


        for(int i = n - 1;i>= 0;i--){
            for(int cap = transactionLimit;cap>0;cap--){
                current[0][cap] = Math.max(prices[i] + after[1][cap - 1],after[0][cap]);
                current[1][cap] = Math.max(after[0][cap] - prices[i],after[1][cap]);
            }
            after = current;
        }

        return after[1][transactionLimit];
    }
}
