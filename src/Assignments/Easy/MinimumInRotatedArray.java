package Assignments.Easy;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        System.out.println("Minimum in Rotated Sorted Array");
        int ans = findMin(new int[] {3,4,5,6,0,1,2});
        System.out.println("Ans - " + ans);
    }

    static int findMin(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                // 4 cases over here
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return nums[mid+1];
                }
                if (mid > start && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                }

                // if elements at middle, start, end are equal then just skip the duplicates
                if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                    // skip the duplicates
                    // NOTE: what if these elements at start and end were the pivot??
                    // check if start is pivot
                    if (start < end && nums[start] > nums[start + 1]) {
                        return nums[start + 1];
                    }
                    start++;

                    // check whether end is pivot
                    if (end > start && nums[end] < nums[end - 1]) {
                        return nums[end];
                    }
                    end--;
                }
                // left side is sorted, so pivot should be in right
                else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
    }
}
