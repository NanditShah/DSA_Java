package DSASheet.Arrays.Easy;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        System.out.println("Running Sum of 1d Array");
    }

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        int sum = 0;

        for(int index = 0;index<nums.length;index++){
            sum += nums[index];
            runningSum[index] = sum;
        }

        return runningSum;
    }
}
