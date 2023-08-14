package Assignments.Easy;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println("Minimum Size Subarray Sum");
    }

    public int minSubArrayLen(int target, int[] nums) {
        long length = Long.MAX_VALUE;
        int left = 0;
        int total = 0;
        for(int right = 0;right<nums.length;right++){
            total += nums[right];
            while(total >= target){
                left += 1;
                total -= nums[left];
                int currentWindowLength = right - left + 1;
                length = Math.min(length,currentWindowLength);
            }
        }
        return (int) (length == Long.MAX_VALUE ? 0 : length);
    }
}
