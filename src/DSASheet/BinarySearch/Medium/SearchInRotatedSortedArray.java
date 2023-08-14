package DSASheet.BinarySearch.Medium;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Sorted Array");
        int[] nums = {6,7,1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(search(nums,6));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int start = 0;
        int end = nums.length - 1;
        System.out.println(pivot);
        if(pivot == -1) return binarySearch(nums,start,end,target);
        if(nums[pivot] == target) return pivot;
        if(nums[start] <= target) return binarySearch(nums,start,pivot - 1,target);
        else return binarySearch(nums,pivot+1,end,target);
    }

    public static int binarySearch(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
        }
        return -1;
    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start - ((start - end)/2);
            System.out.println(mid);
            if(mid < end && nums[mid] > nums[mid+1]) return mid;
            if(mid > start && nums[mid] < nums[mid - 1]) return mid;

            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
