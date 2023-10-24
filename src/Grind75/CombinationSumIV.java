package Grind75;

public class CombinationSumIV {
    public static void main(String[] args) {
        System.out.println("Combination Sum IV");
        int[] nums = {1,2,3};
        System.out.println(combinationSum4(nums,4));
    }

    static int[] dp;

    public static int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        for(int i = 0;i<dp.length;i++) dp[i] = -1;

        getCombinationCountUsingDFS(nums,target);

        return dp[target];
    }

    public static int getCombinationCountUsingDFS(int[] nums,int target){
        if(dp[target] != -1) return dp[target];
        if(target == 0){
            return 1;
        }
        if(target < 0) return 0;

        int count = 0;
        for(int num : nums){
            if(target - num < 0) continue;
            count += getCombinationCountUsingDFS(nums,target - num);
        }
        dp[target] = count;
        return dp[target];
    }
}
