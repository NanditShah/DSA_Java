package Learning.BinarySearch;

public class MountainArrPeak {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2};
        System.out.println("Mountain array peak");
        int ans = mountainArrPeak(arr);
        System.out.println(ans);
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
}
