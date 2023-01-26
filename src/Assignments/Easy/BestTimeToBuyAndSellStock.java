package Assignments.Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println(maxProfit(new int[] {1,2}));
    }

    static int maxProfit(int[] prices) {
        int minValue = 10*10*10*10;
        int diff = 0;
        for(int i = 0;i < prices.length ;i ++){
            minValue = Math.min(prices[i], minValue);
            diff = Math.max(prices[i] - minValue, diff);
        }
        return diff;
    }

}
