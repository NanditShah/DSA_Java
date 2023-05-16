package Learning.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
            int[] asc = {0,1,2,3,4,5,6,7,8,9};
            int foundIndex = orderAgnosticBinarySearch(asc,5);
            System.out.println(foundIndex);

            int[] desc = {9,8,7,6,5,4,3,2,1};
            foundIndex = orderAgnosticBinarySearch(desc,5);
        System.out.println(foundIndex);

    }

    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

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
