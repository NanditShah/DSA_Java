package Grind75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println("Product of Array Except Self");
        int[] ans = productExceptSelf(new int[] {-1,1,0,-3,3});
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int prefixSum = 1;
        for(int i = 0;i<n;i++){
            ans[i] = prefixSum;
            prefixSum *= nums[i];
        }

        int postfixSum = 1;
        for(int i = n-1;i>=0;i--){
            ans[i] *= postfixSum;
            postfixSum *= nums[i];
        }

        return ans;
    }
}
