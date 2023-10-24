package Grind75;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println("Longest Increasing Subsequence");
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] LIS = new int[n];

        Arrays.fill(LIS,1);

        for(int i = n - 2;i>=0;i--){
            for(int j = i +1;i<n;i++)
                if(nums[i] < nums[j])
                    LIS[i] = Math.max(LIS[i],1+LIS[j]);
        }

        int ans = LIS[0];
        for(int i = 1;i<LIS.length;i++)
            ans = Math.max(ans,LIS[i]);

        return ans;
    }
}
