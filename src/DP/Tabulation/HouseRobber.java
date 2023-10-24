package DP.Tabulation;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println("House Robber");


        int[] houses = {2,7,9,3,1};
        System.out.println(rob(houses));
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[n - 1] = nums[n - 1];
        dp[n] = 0;
        int ans = 0;
        for(int i = n - 2;i >= 0;i--){
            int taken = nums[i] + dp[i+2];
            int notTaken = dp[i + 1];
            dp[i] = Math.max(taken,notTaken);
        }
        return dp[0];
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
