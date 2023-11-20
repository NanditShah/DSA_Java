package Blind75.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Sorted Array");
        int[] arr = {4,5,6,7,0,1,2};
        int targetIndex = search(arr,0);
        System.out.println(targetIndex);
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = findPivotIndex(nums,n);
        int start = 0, end = n - 1;
        if(pivotIndex == -1) return binarySearch(nums,start,end,target);
        else if(nums[pivotIndex] == target) return pivotIndex;
        else if(nums[start] <= target) return binarySearch(nums,0,pivotIndex - 1,target);
        else return binarySearch(nums,pivotIndex+1,n - 1,target);
    }

    public static int binarySearch(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start - ((start - end)/2);
            if(nums[mid] == target) return mid;
            else if(target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static int findPivotIndex(int[] nums, int n){
        int start = 0, end = n - 1;

        while(start < end){
            int mid = start - ((start - end) / 2);
            if(mid > start && nums[mid - 1] > nums[mid]) return mid - 1;
            else if(mid < end && nums[mid] > nums[mid + 1]) return mid;

            if(nums[start] > nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
