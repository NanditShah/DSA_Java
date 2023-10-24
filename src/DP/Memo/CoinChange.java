package DP.Memo;


import java.util.HashMap;

// Leetcode - 322
public class CoinChange {
    public static void main(String[] args) {
        System.out.println("Coin Change");

        int[] coins = {2};
        System.out.println(coinChange(coins,0));
    }

    public static int coinChange(int[] coins, int amount) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        memo.put(0,0);

        return dp(coins,amount,memo);
    }

    public static int dp(int[] coins,int amount,HashMap<Integer,Integer> memo){
        if(amount < 0) return -1;
        if(!memo.containsKey(amount)){
            int ans = Integer.MAX_VALUE;
            for(int coin : coins){
                int changeCount = dp(coins,amount - coin,memo);
                if(changeCount == -1) continue;
                ans = Math.min(ans,1+changeCount);
            }
            if(ans == Integer.MAX_VALUE) ans = -1;
            memo.put(amount,ans);
        }
        return memo.get(amount);
    }
}
