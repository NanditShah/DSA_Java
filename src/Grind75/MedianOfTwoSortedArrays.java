package Grind75;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("Median of Two Sorted Arrays");
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1.length < nums2.length ? nums1 : nums2;
        int[] B = nums1.length < nums2.length ? nums2 : nums1;

        int m = A.length, n = B.length;
        int total = m + n;
        int half = total / 2;
        int start = 0, end = m - 1;
        while(true){
            int mid = (int) ((start + end) / 2.00);

            int ALeft = mid < 0 ? Integer.MIN_VALUE : A[mid];
            int ARight = mid >= m ? Integer.MAX_VALUE : A[mid+1];

            int otherWindowSize = half - mid;

            int BLeft = otherWindowSize < 0 ? Integer.MIN_VALUE : B[otherWindowSize];
            int BRight = otherWindowSize >= n ? Integer.MAX_VALUE : B[otherWindowSize+1];

            if(ALeft <= BRight && BLeft <= ARight){
                if(total % 2 == 0){
                    return (Math.max(ALeft,BLeft) + Math.min(ARight,BRight))/2;
                }else{
                    return Math.min(ARight,BRight);
                }
            }
        }
    }
}
