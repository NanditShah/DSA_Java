package DSASheet.TwoPointer.Striver;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from Sorted Array");
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int first = 0,second = 1;
        while(second < nums.length){
            if(nums[first] == nums[second]) second++;
            else{
                first++;
                nums[first] = nums[second];
            }
        }
        return first+1;
    }
}
