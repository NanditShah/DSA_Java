package DP.Memo;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println("House Robber");

        int[] houses = {2,7,9,3,1};
        System.out.println(rob(houses));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];

//        base cases
        Arrays.fill(memo,-1);
        memo[n - 1] = nums[n - 1];

        return solve(0,nums,memo);
    }

    public static int solve(int i,int[] houses,int[] memo){
        if(i >= houses.length) return 0;
        if(memo[i] != -1) return memo[i];

        int taken = houses[i] + solve(i+2,houses,memo);
        int notTaken = solve(i+1,houses,memo);

        memo[i] = Math.max(taken,notTaken);

        return memo[i];
    }

}
