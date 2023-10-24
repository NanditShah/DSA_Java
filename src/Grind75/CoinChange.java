package Grind75;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println("Coin Change");
    }

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        for(int a = 1;a<=amount;a++){
            for(int coin : coins){
                if(a - coin >= 0) dp[a] = Math.min(dp[a],1+dp[a - coin]);
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
