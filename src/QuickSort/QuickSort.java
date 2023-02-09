package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Quick sort");
        int[] arr= {4,6,21,6,67,2,1,3,13,46,1,5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;

//        We are taking last index element as a pivot element
        int pivot = high;

        while(start <= end){
            while(arr[start] < arr[pivot]){
                start ++;
            }
            while(arr[end] > arr[pivot]){
                end --;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }
}
