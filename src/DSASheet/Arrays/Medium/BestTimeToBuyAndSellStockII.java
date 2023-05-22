package DSASheet.Arrays.Medium;

public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock II\n");
    }

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
