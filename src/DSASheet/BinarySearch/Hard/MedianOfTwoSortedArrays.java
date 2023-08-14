package DSASheet.BinarySearch.Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Median of Two Sorted Arrays");
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1.length <= nums2.length ? nums1 : nums2;
        int[] B = nums1.length <= nums2.length ? nums2 : nums1;

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int m = A.length;
        int n = B.length;

        int total = m+n;
        int half = (int) Math.floor(total / 2);

        int start = 0;
        int end =  m - 1;

        while(true){
            int i = (int)Math.floor((start+end)/2.0);
            int j = half - i - 2;

            int ALeft = i >= 0 ? A[i] : Integer.MIN_VALUE;
            int ARight = (i+1) < m ? A[i+1] : Integer.MAX_VALUE;

            int BLeft = j >= 0 ? B[j] : Integer.MIN_VALUE;
            int BRight = (j+1) < n ? B[j+1] : Integer.MAX_VALUE;

//            If Correct partition found
            if(ALeft <= BRight && BLeft <= ARight){
                if(total % 2 == 1) return Math.min(ARight,BRight);
                return (Math.max(ALeft,BLeft)+Math.min(ARight,BRight))/2.0;
            }
            else if(ALeft > BRight) end = i - 1;
            else start = i + 1;
        }

    }
}
