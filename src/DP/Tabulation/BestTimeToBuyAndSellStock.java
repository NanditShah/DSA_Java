package DP.Tabulation;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
    }

    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        if(prices.length == 2) Math.max(prices[1] - prices[0],0);

        int profit = 0;
        int minVal = prices[0];
        for(int i = 0;i<prices.length;i++){
            profit = Math.max(prices[i] - minVal,profit);
            minVal = Math.min(minVal,prices[i]);
        }
        return profit;
    }
}
