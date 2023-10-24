package Grind75;

import java.util.Arrays;
import java.util.Queue;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println("Move Zeroes");
        int[] arr = {0,1,0,2,0,3,0,4,0,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        int numIndex = 0;
        for(int num : nums){
            if(num != 0){
                nums[numIndex] = num;
                numIndex++;
            }
        }
        for(int i = numIndex;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
