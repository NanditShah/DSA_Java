package DSASheet.BinarySearch.Medium;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println("Find First and Last Position of Element in Sorted Array");
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(new int[] {},7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = findTargetIndex(nums,target,true);
        if(ans[0] != -1) ans[1] = findTargetIndex(nums,target,false);
        return ans;
    }

    public static int findTargetIndex(int[] nums,int target,boolean findFirstIndex){
        int start = 0,end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(findFirstIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return ans;
    }
}
