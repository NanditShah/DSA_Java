package Grind75;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println(maxProfit(new int[] {7,6,2,1,0,4,3,1,10,0}));

    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        if(prices.length == 2) return Math.max(prices[1] - prices[0],0);
        int maxProfit = Integer.MIN_VALUE;
        int sell = 1, buy = 0;
        while(sell < prices.length){
            int currProfit = prices[sell] - prices[buy];
            if(currProfit < 0) buy++;
            else{
                maxProfit = Math.max(currProfit,maxProfit);
                sell++;
            }
        }
        return Math.max(maxProfit,0);
    }
}
