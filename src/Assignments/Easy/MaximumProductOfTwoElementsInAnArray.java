package Assignments.Easy;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        System.out.println("Maximum Product of Two Elements in an Array");
    }

    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int  n = nums.length;
        int maxEle = nums[n-1],minEle = nums[n-2];
        return ((maxEle - 1)*(minEle-1));
    }
}
