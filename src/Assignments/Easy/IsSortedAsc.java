package Assignments.Easy;

public class IsSortedAsc {
    public static void main(String[] args) {
        System.out.println("Is array sorted or not");
        int[] arr = {1,2,3};
        System.out.println(isSorted(arr,0));
    }

    static boolean isSorted(int[] arr,int  start){
        if(arr.length == 1){
            return true;
        }
        if(start == arr.length - 2 && arr[start] <= arr[start+1]){
            return true;
        }
        if(arr[start] > arr[start+1]){
            return false;
        }
        return isSorted(arr,start+1);

    }
}
