package Grind75;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println("Find First and Last Position of Element in Sorted Array");
    }

    public int[] searchRange(int[] nums, int target) {
        if((nums.length == 0) || (nums.length == 1 && nums[0] != target)) return new int[] {-1,-1};
        if(nums.length == 1 && nums[0] == target) return new int[] {0,0};

        int firstIndex = findIndexOfElement(nums,target,true);
        int secondIndex = -1;
        if(firstIndex != -1){
            secondIndex = findIndexOfElement(nums,target,false);
        }
        return new int[] {firstIndex,secondIndex};
    }


    public int findIndexOfElement(int[] nums,int target,boolean findFirstIndex){
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(target <= nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
