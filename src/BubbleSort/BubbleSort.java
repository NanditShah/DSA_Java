package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
        bubbleSortUsingRec(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            boolean swapped = false;
            for(int j = 1;j< arr.length - i;j++ ){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    static void bubbleSortUsingRec(int[] arr){
        helperSort(arr,0,1);
    }

    static void helperSort(int[] arr,int start,int compareIndex){
        if(start == arr.length-1){
            return;
        }
        if(compareIndex < arr.length - start){
            if(arr[compareIndex] < arr[compareIndex-1]){
                int temp = arr[compareIndex-1];
                arr[compareIndex-1] = arr[compareIndex];
                arr[compareIndex] = temp;
            }
            helperSort(arr,start,compareIndex+1);
        }else{
            helperSort(arr,start+1,1);
        }
    }

}
