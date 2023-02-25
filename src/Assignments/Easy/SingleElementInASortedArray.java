package Assignments.Easy;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        System.out.println("Single Element in a Sorted Array");
        System.out.println(singleNonDuplicate(new int[] {3,3,7,7,10,10,11}));
    }

    static int singleNonDuplicate(int[] nums) {
        for(int i = 0;i<nums.length;i+=2){
            if(i == nums.length - 1){
                return nums[i];
            }
            if((nums[i] - nums[i+1]) != 0){
                return nums[i];
            }
        }
        return -1;
    }
}
