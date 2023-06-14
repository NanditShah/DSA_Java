package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PartitionToKEqualSumSubsets {
    public static void main(String[] args) {
        System.out.println("Partition to K Equal Sum Subsets");
        int[] nums = {1,2,3,4};
        int k = 3;
        boolean ans = canPartitionKSubsets(nums,k);
        System.out.println(ans);
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        final int sum = Arrays.stream(nums).sum();
        if (sum % k != 0)
            return false;

        int target = sum / k; // Each subset's target sum
        boolean[] visited = new boolean[nums.length];
        return dfs(nums, 0, k, target, target, visited);
    }

    private static boolean dfs(int[] nums, int s, int k, int target, int subsetTargetSum, boolean[] visited) {
        if (k == 0)
            return true;
        if (target < 0)
            return false;
        if (target == 0)
            return dfs(nums, 0, k - 1, subsetTargetSum, subsetTargetSum, visited);

        for (int i = s; i < nums.length; ++i) {
            if (visited[i])
                continue;
            visited[i] = true;
            if (dfs(nums, i + 1, k, target - nums[i], subsetTargetSum, visited))
                return true;
            visited[i] = false;
        }

        return false;
    }
}
