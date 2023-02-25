package Assignments.Easy;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");
    }

    static int[] buildArray(int[] nums) {
        int[] ansArr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            ansArr[i] = nums[nums[i]];
        }
        return ansArr;
    }
}
