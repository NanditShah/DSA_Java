package Grind75;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Majority Element");
    }

    public int majorityElement(int[] nums) {
        int majorityElement = nums[0],count = 1;

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == majorityElement) count++;
            else{
                count--;
                if(i == 0){
                    majorityElement = nums[i];
                    count++;
                }
            }
        }
        return majorityElement;
    }
}
