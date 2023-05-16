package Assignments.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Learning.Arrays");
        int[] is = intersection(new int[] {1,2,2,1},new int[] {2,2});
        System.out.println(Arrays.toString(is));
    }

    static int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Set<Integer> ns2 = new HashSet();
        for(int n2: nums2){
            if(binarySearch(nums1,n2)){
                ns2.add(n2);
            }
        }

        int[] ans = new int[ns2.size()];
        int i = 0;
        for(int a: ns2){
            ans[i++] = a;
        }
        return ans;
    };

    static boolean binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return true;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }

}
