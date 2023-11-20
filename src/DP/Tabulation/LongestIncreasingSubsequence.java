package DP.Tabulation;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println("Longest Increasing Subsequence");
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;

        int[] dp = new int[n];
        Arrays.fill(dp,1);

        int maxVal = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],1 + dp[j]);
                }
            }
            maxVal = Math.max(dp[i],maxVal);
        }

        System.out.println(Arrays.toString(dp));
        return maxVal;
    }
}
