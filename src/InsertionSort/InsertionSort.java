package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int[] arr = {5,1,5,7,12,346,-1,2,6,21354,6,0,-4,-6,1,5,-1,4,-14};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
