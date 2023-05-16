package DSASheet.Arrays.Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println(maxProfit(new int[] {1,2,4,2,5,7,2,4,9,0,9}));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int minBuyStock = prices[0];
        int profit = 0;

        for(int i =1;i<prices.length;i++){
            minBuyStock = Math.min(minBuyStock,prices[i]);
            profit = Math.max(prices[i] - minBuyStock,profit);
        }
        return profit;
    }
}
