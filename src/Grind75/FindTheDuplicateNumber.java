package Grind75;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Find the Duplicate Number");
    }


    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) break;
        }

        int slow2 = 0;

        while(true){
            slow = nums[slow];
            slow2 = nums[slow2];

            if(slow == slow2) return slow;
        }
    }
}
