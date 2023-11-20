package DP.Tabulation;

import java.util.Arrays;

public class BurstBalloons {
    public static void main(String[] args) {
        System.out.println("Burst Balloons");
    }

    public static int maxCoins(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] newArr = new int[n+2];
        newArr[0] = 1;
        newArr[n+1] = 1;

        for(int i = 0;i<n;i++){
            newArr[i+1] = nums[i];
        }

        int[][] dp = new int[n+2][n+2];


        for(int i = n;i>=1;i--){
            for(int j = 1;j<=n;j++){
                if(i > j) continue;
                int maxVal = Integer.MIN_VALUE;
                for(int k = i;k<=j;k++){
                    int newPoints = (newArr[i - 1] * newArr[k] * newArr[j + 1])
                            + dp[i][k-1] + dp[k + 1][j];
                    maxVal = Math.max(maxVal,newPoints);
                }
                dp[i][j] = maxVal;
            }
        }
        return dp[1][n];
    }
}
