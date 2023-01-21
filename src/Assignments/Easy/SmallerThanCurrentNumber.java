package Assignments.Easy;

import java.util.Arrays;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        System.out.println("Smaller Than the Current Number");
        int[] nums = {6,5,4,8};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int[] ans = new int[nums.length];
        while(i < n){
            int count = 0;
            while(j<n){
                if(nums[i] > nums[j] && i != j){
                    count++;
                }
                j++;
            }
            ans[i] = count;
            i++;
            j = 0;
        }
        return ans;

    }
}
