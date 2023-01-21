package Assignments.Easy;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println("Third Maximum Number");
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length < 3){
            return nums[nums.length - 1];
        }

        int max = nums[nums.length - 1];
        int maxCount = 1;
        for(int i = nums.length - 1;i>=0;i--){
            if(nums[i] < max){
                max = nums[i];
                maxCount ++;
            }
            if(maxCount == 3){
                return max;
            }
        }
        return maxCount != 3 ? nums[nums.length - 1] : max;

    }
}
