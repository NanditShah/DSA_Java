package Learning.BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,10,14,18,22,26,30};
        int ceil = floorOfNumberInArray(arr,7);
        System.out.println(ceil);
    }

    static int floorOfNumberInArray(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]){
            return -1;
        }

        while(start <= end){
            int mid = start - ((start - end)/2);
            if(target == arr[mid]){
                return target;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
