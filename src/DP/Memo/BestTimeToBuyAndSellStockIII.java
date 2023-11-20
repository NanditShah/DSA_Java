package DP.Memo;

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

        int[][][] memo = new int[n][2][transactionLimit+1];

        for(int[][] multiArr : memo)
            for(int[] arr : multiArr)
                Arrays.fill(arr,-1);

        return calculateProfit(prices,memo,0,1,transactionLimit);
    }

    public int calculateProfit(int[] prices,int[][][] memo,int day,int canBuy,int transactionLimit){
        if(transactionLimit == 0 || day == prices.length) return 0;

        if(memo[day][canBuy][transactionLimit] != -1) return memo[day][canBuy][transactionLimit];
        if(canBuy == 1)
            memo[day][canBuy][transactionLimit] = Math.max(calculateProfit(prices,memo,day+1,0,transactionLimit) - prices[day],
                    calculateProfit(prices,memo,day+1,1,transactionLimit));
        else
            memo[day][canBuy][transactionLimit] = Math.max(prices[day] + calculateProfit(prices,memo,day+1,1,transactionLimit - 1),
                    calculateProfit(prices,memo,day+1,0,transactionLimit));
        return memo[day][canBuy][transactionLimit];
    }
}
