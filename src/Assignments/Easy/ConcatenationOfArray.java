package Assignments.Easy;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println("Concatenation of Array");
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concatedArr = new int[n * 2];
        for (int i = 0; i < n; i++){
            concatedArr[n + i] = nums[i];
            concatedArr[i] = nums[i];
        }
        return concatedArr;


//OR using System.arraycopy
//        int[] ans = new int[ nums.length * 2 ];
//        System.arraycopy( nums , 0 , ans , 0 , nums.length ) ;
//        System.arraycopy( nums , 0 , ans , ans.length / 2 , nums.length ) ;
//        return ans ;
    }
}
