package DSASheet.Arrays.Easy;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        System.out.println("Squares of a Sorted Array");
    }

    public int[] sortedSquares(int[] nums) {
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
