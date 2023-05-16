package DSASheet.Arrays.Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge Sorted Array");

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] actualNums1 = new int[m];

        for(int i = 0;i<m;i++){
            actualNums1[i] = nums1[i];
        }

        int index1 = 0,index2 = 0;

        int index = 0;
        while(index1 < m && index2 < n){
            if(actualNums1[index1] <= nums2[index2]){
                nums1[index] = actualNums1[index1];
                index1++;
            }else{
                nums1[index] = nums2[index2];
                index2++;
            }
            index++;
        }

        while(index1 < m){
            nums1[index] = actualNums1[index1];
            index1++;
            index++;
        }

        while(index2 < n){
            nums1[index] = nums2[index2];
            index2++;
            index++;
        }

    }
}
