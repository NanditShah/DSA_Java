package DSASheet.BinarySearch.Easy;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");

        int[] nums = {};
        int target = 2;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int start = 0,end = nums.length - 1;
        return binarySearch(nums,target,start,end);
    }

    public static int binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            int mid = (start + (end - start) / 2);
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
