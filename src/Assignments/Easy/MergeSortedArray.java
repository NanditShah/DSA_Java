package Assignments.Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge Sorted Array");
        merge(new int[] {0},0,new int[] {1},1);
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n - 1,k = (m+n)-1;

        while(i >= 0 && j >= 0){
         if(nums1[i] < nums2[j]){
             nums1[k] = nums2[j];
             j --;
             k --;
         }else{
             nums1[k] = nums1[i];
             i --;
             k --;
         }
        }
        while(i >= 0){
            nums1[k--] = nums1[i--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
