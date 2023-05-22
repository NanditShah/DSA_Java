package DSASheet.Arrays.Easy;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Majority Element");
        int[] arr = {3,2,3};
        int majorityElement = majorityElement(arr);
        System.out.println(majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for(int i = 1;i<nums.length;i++){
            if(nums[i] == majorityElement){
                count++;
            }else{
                count--;
                if(count == 0){
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }
        return majorityElement;
    }

}
