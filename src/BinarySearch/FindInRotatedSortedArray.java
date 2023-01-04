package BinarySearch;

public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Find In Rotated Sorted Array");
        int[] arr = {3,1};
        int ans = findAns(arr,1);
        System.out.println(ans);
    }

    static int findAns(int[] arr,int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,0,arr.length - 1,target);
        }
        if(arr[pivot] ==  target){
            return pivot;
        }
        if(arr[0] <= target){
            return binarySearch(arr,0,pivot-1,target);
        }else{
            return binarySearch(arr,pivot+1,arr.length - 1,target);
        }
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start - ((start - end)/2);
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int start, int end, int target){

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                    end = mid - 1;
            }else{
                    start = mid + 1;
            }
        }
        return -1;
    }

//    For Duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
