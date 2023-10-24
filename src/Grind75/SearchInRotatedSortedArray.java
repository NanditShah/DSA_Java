package Grind75;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Sorted Array");
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int start = 0,end = nums.length - 1;
        if(pivot == -1){
            binarySearch(nums,start,end,target);
        }
        if(nums[pivot] == target) return pivot;
        if(nums[start] <= target) return binarySearch(nums,start,pivot-1,target);
        else return binarySearch(nums,pivot+1,end,target);
    }

    public int binarySearch(int[] nums,int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid - 1;
        }
        return -1;
    }


    public int findPivot(int[] nums){
        int start = 0, end = nums.length - 1;

        while(start < end){
            int mid = start + ((end - start)/2);
            if(mid < end && nums[mid] > nums[mid + 1]) return mid;
            if(mid > start && nums[mid-1] > nums[mid]) return mid - 1;
            if(nums[start] >= nums[mid]) end = mid - 1;
            else start = mid+1;

        }
        return -1;
    }


}
