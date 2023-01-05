package Assignments.Easy;

import java.util.Arrays;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println("First Bad Version");
        int[] arr = {1,2,3,4,5,6,7,8};
        int fVersion = firstBadVersion(8);
        System.out.println(fVersion);
    }

    static boolean isBadVersion(int n){
        if (n == 2 || n == 3 || n == 4) {
            return true;
        }
        return false;
    }
    static int firstBadVersion(int n){
        int start = 1;
        int end = n;

        while (start < end){
            int mid = start - ((start - end)/2);
            System.out.println(start+" "+end+" "+mid);
            if(isBadVersion(mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
