package Assignments.Easy;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains Duplicate");
        int[] arr = {3,3};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1){
            return false;
        }
        Arrays.sort(nums);

        for(int i = 1; i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
