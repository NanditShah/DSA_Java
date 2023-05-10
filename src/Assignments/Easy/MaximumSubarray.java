package Assignments.Easy;

public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum Subarray");
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int num = 0;num < nums.length; num++){
            currSum = currSum + nums[num];

            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;

    }
}
