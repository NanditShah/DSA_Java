package Assignments.Easy;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println("Frequency of the Most Frequent Element");

    }

    static int findDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int min = 1;
        int max = nums.length - 1;
        while(min < max){
            int mid = min + (max-min)/2;
            int count = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count <= mid){
                min = mid + 1;
            }else{
                max = mid;
            }
        }
        return min;
    }
}
