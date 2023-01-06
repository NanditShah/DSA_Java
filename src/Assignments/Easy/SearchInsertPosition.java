package Assignments.Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println("Search Insert Position");
        int ans = searchInsert(new int[] {1,3},5);


        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target){
        int start=0,end=nums.length-1;
        int ans = search(nums,target,start,end);
        return nums[ans] < target ? ans + 1 : ans;
    }

    static int search(int[] arr,int target,int start,int end){
        while (start < end){
            System.out.println(start+" "+end);
            int mid = start - (start - end)/2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
