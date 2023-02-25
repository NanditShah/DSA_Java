package Assignments.Easy;

import java.util.Arrays;

public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        System.out.println("Keep Multiplying Found Values by Two");
    }

    static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == original){
                original *= 2;
            }
        }
        return original;
    }
}
