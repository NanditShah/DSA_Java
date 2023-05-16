package DSASheet.Arrays.Easy;

import java.util.ArrayList;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println("Move Zeroes");
    }

    public void moveZeroes(int[] nums) {

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
