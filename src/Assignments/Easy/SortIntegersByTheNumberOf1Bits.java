package Assignments.Easy;

import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        System.out.println("Sort Integers by The Number of 1 Bits");
    }

    static int[] sortByBits(int[] arr) {
        Integer[] arrInt = new Integer[arr.length];
        int index = 0;
        for(int ele : arr){
            arrInt[index++] = ele;
        }

        Arrays.sort(arrInt,(a,b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));

        index = 0;
        for(int ele : arrInt){
            arr[index++] = ele;
        }
        return arr;
    }
}
