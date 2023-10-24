package Assignments.Easy;

import java.util.Arrays;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Find the Duplicate Number");
    }

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);

        fast = nums[0];

        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;

    }


}
