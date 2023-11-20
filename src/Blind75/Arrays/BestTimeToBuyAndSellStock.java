package Blind75.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1;i<prices.length;i++){
            buy = Math.min(prices[i],buy);
            if(prices[i] > buy) profit = Math.max(profit,(prices[i] - buy));
        }
        return profit;
    }
}
