package Assignments.Easy;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        System.out.println("Binary Search Using Recursion");
        System.out.println(search(new int[] {-1,0,3,5,9,12},2));
    }

    static int search(int[] nums, int target) {
        int start = 0,end = nums.length - 1;
        return binarySearch(nums,target,start,end);
    }

    static int binarySearch(int[] nums, int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = end - ((end - start)/2);
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums,target,start,mid - 1);
        }else{
            return binarySearch(nums,target,mid+1,end);
        }
    }

}
