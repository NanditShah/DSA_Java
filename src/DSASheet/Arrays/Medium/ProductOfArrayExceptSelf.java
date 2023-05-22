package DSASheet.Arrays.Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("Product of Array Except Self");

        int[] ansArr = productExceptSelf(new int[] {1,2,3,4});

        System.out.println(Arrays.toString(ansArr));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ansArr = new int[nums.length];

        int prefix = 1;
        for(int i = 0;i<nums.length;i++){
            ansArr[i] = prefix;
            prefix *= nums[i];
        }

        int postFix = 1;
        for(int i = nums.length-1;i>=0;i--){
            ansArr[i] *= postFix;
            postFix *= nums[i];
        }

        return ansArr;
    }

}
