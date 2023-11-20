package DP.Memo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println("Longest Increasing Subsequence");
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return 1;

        int[][] memo = new int[n][n];
        for(int[] arr : memo) Arrays.fill(arr,-1);

        return calculate(nums,0,-1,memo);
    }

    public int calculate(int[] nums,int currIndex,int prevIndex,int[][] memo){
        if(currIndex >= nums.length) return 0;

        if(prevIndex == -1){
            int take = 1 + calculate(nums,currIndex+1,currIndex,memo);
            int notTake = calculate(nums,currIndex+1,prevIndex,memo);
            return Math.max(take,notTake);
        }else{
            if(memo[currIndex][prevIndex] != -1) return memo[currIndex][prevIndex];

            int take = 0;
            if(nums[currIndex] > nums[prevIndex])
                take = 1 + calculate(nums,currIndex+1,currIndex,memo);

            int notTake = calculate(nums,currIndex+1,prevIndex,memo);

            memo[currIndex][prevIndex] = Math.max(take,notTake);
            return memo[currIndex][prevIndex];
        }

    }
}
