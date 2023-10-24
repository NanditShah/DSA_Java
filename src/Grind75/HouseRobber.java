package Grind75;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println("House Robber");
        int[] houses = {1,2,1,1};
        System.out.println(rob(houses));
    }

    public static int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return calculate(0,dp,nums);
    }

    public static int calculate(int start,int[] dp,int[] nums){
        if(start >= nums.length) return 0;
        if(dp[start] != -1) return dp[start];

        int pick=nums[start]+calculate(start+2,dp,nums);
        int notPick=calculate(start+1,dp,nums);

        dp[start] = Math.max(pick,notPick);
        System.out.println(Arrays.toString(dp));
        return dp[start];
    }
}
