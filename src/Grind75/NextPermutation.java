package Grind75;

public class NextPermutation {
    public static void main(String[] args) {
        System.out.println("Next Permutation");
    }

    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;

        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;

        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length - 1);
    }

    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }


}
