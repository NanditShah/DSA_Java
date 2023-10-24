package Grind75;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum Subarray");
        System.out.println(maxSubArray(new int[] {-1}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        int i = 0;
        while(i < nums.length && nums[i] < 0) {
            maxSum = Math.max(nums[i], maxSum);
            i++;
        }
        int j = i;
        int currSum = 0;
        while(j < nums.length){
            currSum += nums[j];
            if(currSum < 0){
                i = j;
                currSum = 0;
            }
            j++;
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
