package Blind75.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum Subarray");
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        int n = nums.length;

        int i = 0;
        while(i < n && nums[i] < 0) {
            maxSum = Math.max(nums[i], maxSum);
            i++;
        }

        int currSum = 0;
        while(i < n){
            currSum += nums[i];
            if(currSum < 0) currSum = 0;

            i++;
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
