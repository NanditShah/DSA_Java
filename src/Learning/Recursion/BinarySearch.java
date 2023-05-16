package Learning.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] array = {0,1,2,3,4,5,6,7,8,10};
        System.out.println(binarySearch(array,17,0,array.length-1   ));
    }

    static int binarySearch(int[] arr, int target,int start,int end){
        if(start > end){
            return -1;
        }
        int middle = start + ((end - start)/2);

        if(arr[middle] == target){
            return middle;
        }else if(arr[middle] > target){
            return binarySearch(arr,target,start,middle - 1);
        }else{
            return binarySearch(arr,target,middle+1,end);
        }
    }
}
