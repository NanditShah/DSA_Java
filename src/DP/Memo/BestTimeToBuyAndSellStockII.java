package DP.Memo;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock II");
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        if(n == 2) Math.max(prices[1] - prices[0],0);

        int[][] memo = new int[n][2];

        for(int[] arr : memo) Arrays.fill(arr,-1);

        return calculateProfit(prices,memo,0,1);
    }

    public int calculateProfit(int[] prices,int[][] memo,int day,int canBuy){
        if(day == prices.length) return 0;

        if(memo[day][canBuy] != -1) return memo[day][canBuy];
        if(canBuy == 1)
            memo[day][canBuy] = Math.max(calculateProfit(prices,memo,day+1,0) - prices[day],
                calculateProfit(prices,memo,day+1,1));
        else
            memo[day][canBuy] = Math.max(prices[day] + calculateProfit(prices,memo,day+1,1),
                    calculateProfit(prices,memo,day+1,0));
        return memo[day][canBuy];
    }

}
