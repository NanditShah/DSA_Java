package Learning.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] reversedArr = reverseArr(arr);
        System.out.println(Arrays.toString(reversedArr));
    }


//    Swapping elements
    static void swapElement(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

//    Reversing array by swapping ith and ((n-i)-1)th element in array
    static int[] reverseArr(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int lastIndex = arr.length - 1;
        int startIndex = 0;
        while(startIndex < lastIndex){
            swapElement(arr,startIndex,lastIndex);
            lastIndex --;
            startIndex++;
        }
        return arr;
    }
}
