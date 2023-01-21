package Assignments.Easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        System.out.println("Sort Array By Parity");
        int[] nums = {1,3,5,7,9};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        int n = nums.length;
        int evenCount = getEvenCount(nums);
        int oddCount = n - evenCount;
        if(evenCount == 0 || oddCount == 0){
            return nums;
        }
        int i = 0;
        int j = evenCount;
        int[] ans = new int[n];
        for(int num : nums) {
            if (num % 2 != 0) {
                ans[j] = num;
                j++;
            } else {
                ans[i] = num;
                i++;
            }
        }
        return ans;
    }

    static int getEvenCount(int[] nums){
        int count = 0;
        for(int number : nums){
            if(number % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
