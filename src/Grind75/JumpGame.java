package Grind75;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println("Jump Game");
    }

    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for(int i = nums.length - 1;i>=0;i--){
            if(nums[i] + i >= goal) goal = i;
        }
        return goal == 0;
    }
}
