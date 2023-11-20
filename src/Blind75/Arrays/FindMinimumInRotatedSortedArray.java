package Blind75.Arrays;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Find Minimum in Rotated Sorted Array");
    }

    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = start - ((start - end)/2);

            if(mid < end && nums[mid] > nums[mid + 1]) return nums[mid+1];
            if(mid > start && nums[mid-1] > nums[mid]) return nums[mid];

            if(nums[start] > nums[mid]) end = mid;
            else start = mid + 1;
        }
        return nums[0];
    }
}
