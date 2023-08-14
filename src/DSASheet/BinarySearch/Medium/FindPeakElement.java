package DSASheet.BinarySearch.Medium;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println("Find Peak Element");
    }

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        int start = 0,end = n-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid > 0 && nums[mid - 1] > nums[mid]) end = mid - 1;
            else if(mid < n - 1 && nums[mid + 1] > nums[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
