package Grind75;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        System.out.println("Partition Equal Subset Sum");
        System.out.println(canPartition(new int[] {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97}));
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) sum += num;

        if(sum % 2 != 0) return false;

        return isSubsetOfGivenSumPossible(nums,sum / 2);
    }

    public static boolean isSubsetOfGivenSumPossible(int[] nums,int sum){
        boolean[][] dp = new boolean[sum + 1][nums.length + 1];

        for (int i = 0; i <= nums.length; i++)
            dp[0][i] = true;

        for (int i = 1; i <= sum; i++)
            dp[i][0] = false;

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= nums.length; j++) {
                dp[i][j] = dp[i][j - 1];
                if (i >= nums[j - 1])
                    dp[i][j]
                            = dp[i][j]
                            || dp[i - nums[j - 1]][j - 1];
            }
        }
        return dp[sum][nums.length];

    }
}
