package Blind75.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum Product Subarray");
    }

    public int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0], ans = nums[0];

        for(int i = 1;i<nums.length;i++){
            int temp = max;
            max = Math.max(Math.max(nums[i] * max,nums[i] * min),nums[i]);
            min = Math.max(Math.max(nums[i] * temp,nums[i] * min),nums[i]);

            ans = Math.max(ans,max);
        }
        return ans;
    }
}
