package DSASheet.BinarySearch.Easy;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        System.out.println("Peak Index in a Mountain Array");
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start - ((start - end)/2);
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
