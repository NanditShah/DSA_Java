package Assignments.Easy;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        System.out.println("Array Partition");
        int maximizedSum = arrayPairSum(new int[] {1,4,3,2});
        System.out.println(maximizedSum);
    }

    static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0;i<nums.length;i+=2){
            ans += nums[i];
        }
        return ans;
    }
}
