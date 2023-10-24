package Assignments.Easy;

public class MonotonicArray {
    public static void main(String[] args) {
        System.out.println("Monotonic Array");
    }

    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2) return true;
        int diff = 0;
        int i = 0;
        while(diff == 0 && i <= nums.length - 2){
            diff = nums[i] - nums[i+1];
            i++;
        }

        if(i == nums.length - 1) return true;

        boolean negative = diff < 0;

        while(i <= nums.length - 2){
            diff = nums[i] - nums[i + 1];
            if(negative && diff > 0) return false;
            if(!negative && diff < 0) return false;
            i++;
        }
        return true;
    }
}
