package DP.Tabulation;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock II");
    }

    // Using DP, but even this is  not most optimized, optimized one is learned from NEETCODE.
// public int maxProfit(int[] prices) {
//         int ans = 0;
//         int[] next = new int[2];
//         int[] curr = new int[2];
//         for(int i=prices.length-1; i>=0; i--){
//             curr[1] = Math.max(-prices[i]+next[0], next[1]);
//             curr[0] = Math.max(prices[i]+next[1], next[0]);
//             next = curr;
//         }
//         return next[1];
//     }

    // Most optimized
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                totalProfit += (prices[i] - prices[i-1]);
            }
        }
        return totalProfit;
    }
}
