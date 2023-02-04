package Assignments.Easy;

public class RotatedBinarySearchByRec {
    public static void main(String[] args) {

        System.out.println("Rotated binary search");
        int[] arr={4,5,6,7,1,2,3};
        int foundIndex = rotatedBinarySearchByRec(arr,0,arr.length-1,2);
        System.out.println(foundIndex);
    }

    static int rotatedBinarySearchByRec(int[] arr,int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(arr[start] <= target && arr[mid] > target){
                return rotatedBinarySearchByRec(arr,start,mid - 1,target);
            }else{
                return rotatedBinarySearchByRec(arr,mid+1,end,target);
            }
        }
            if(arr[end] >= target && arr[mid] < target){
                return rotatedBinarySearchByRec(arr,mid + 1,end,target);
            }else{
                return rotatedBinarySearchByRec(arr,start,mid - 1,target);
            }
    }
}
