package Learning.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        System.out.println("Find In Mountain Array");
        int[] arr = {0, 1, 2, 3, 5, 6, 7, 6, 5, 4, 3, 2};
        int ans = findAns(arr,4);
        System.out.println(ans);
    }

    static int findAns(int[] arr,int target){
        int peak = mountainArrPeak(arr);
        int ans = orderAgnosticBinarySearch(arr,0,peak-1,target,true);
        if(ans == -1){
            ans = orderAgnosticBinarySearch(arr,peak,arr.length-1,target,false);
        }
        return ans;
    }

    static int mountainArrPeak(int[] arr){
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

    static int orderAgnosticBinarySearch(int[] arr,int start,int end,int target,boolean isAsc){

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return mid;
            }else if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }



}
