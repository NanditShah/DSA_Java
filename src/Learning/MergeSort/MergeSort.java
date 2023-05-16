package Learning.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge Sort");
        int[] arrToBeSorted = {4,6,2,7,1,8,1,1,7,8,54};
        int[] sortedArr = mergeSort(arrToBeSorted);
        System.out.println(Arrays.toString(sortedArr));

        mergeSort(arrToBeSorted,0,arrToBeSorted.length);
        System.out.println(Arrays.toString(arrToBeSorted));
    }

    static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1){
            return arr;
        }
        int mid = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,n));

        return merge(left,right);
    }

    static int[] merge(int[] left,int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

        int[] finalArr = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                finalArr[k] = left[i];
                i++;
            }else{
                finalArr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            finalArr[k] = left[i];
            k++;
            i++;
        }

        while(j < right.length){
            finalArr[k] = right[j];
            k++;
            j++;
        }

        return finalArr;
    }


//    Inplace approach
    static void mergeSort(int[] arr,int start,int end){
        if(end - start == 1){
            return;
        }
        int mid = start - ((start - end)/2);

       mergeSort(arr,start,mid);
       mergeSort(arr,mid,end);

        merge(arr,start,mid ,end);
    }

    static void merge(int[] arr,int start,int mid,int end){
        int i = start;
        int j = mid;
        int k = 0;

        int[] finalArr = new int[end - start];
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                finalArr[k] = arr[i];
                i++;
            }else{
                finalArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            finalArr[k] = arr[i];
            k++;
            i++;
        }

        while(j < end){
            finalArr[k] = arr[j];
            k++;
            j++;
        }

        for(int l = 0;l<finalArr.length;l++){
            arr[start+l] = finalArr[l];
        }
    }


}
