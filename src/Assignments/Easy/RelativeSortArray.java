package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        System.out.println("Relative Sort Array");
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        int[] ans = relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int n: arr1)     cnt[n]++;
        int i = 0;
        for (int n : arr2) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < cnt.length; n++) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;

    }
}
