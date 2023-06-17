package DSASheet.Maths.Easy;

import java.util.Arrays;
import java.util.Map;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Maximum Product of Three Numbers");
        System.out.println(maximumProduct(new int[] {1,2,3,4}));
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[2],nums[n - 1]*nums[n - 2]*nums[n - 3]);
    }
}
