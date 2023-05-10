package Assignments.Easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock");
        System.out.println(maxProfitAlternateMethod(new int[] {1,2,4,2,5,7,2,4,9,0,9}));
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

    public static int maxProfitAlternateMethod(int[] prices) {
        if(prices.length == 1) return 0;

        int buy = 0,sell = 1;
        int maxProfit = 0;
        while(sell < prices.length){
            if(prices[buy] < prices[sell]){
                maxProfit = Math.max(prices[sell] - prices[buy],maxProfit);
            }else{
                buy = sell;
            }
            sell++;
        }

        return maxProfit;

    }

}
