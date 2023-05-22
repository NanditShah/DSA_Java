package DSASheet.Arrays.Medium;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from Sorted Array");
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return 1;
        }
        int first = 0;
        int second = 1;

        while(second < n){
            if(nums[first] == nums[second]){
                second++;
            }
            first++;
            nums[first] = nums[second];
        }
        return first+1;
    }
}
