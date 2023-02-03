package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrayCode {
    public static void main(String[] args) {
        System.out.println("Gray Code");
        grayCode(2);
    }

    static List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        if(n == 1){
            ans.add(0);
            ans.add(1);
        }else{
            for(int i = 0;i<Math.pow(2,n);i++){
                ans.add(convertToGrayCode(i,n));
            }
        }
        return ans;
    }

    static int convertToGrayCode(int n,int maxLength){
        int ans = 0;
        int[] bits = new int[maxLength];
        int i = maxLength - 1;
        while(n > 0){
            bits[i--] = n & 1;
            n = n >> 1;
        }
        int[] newBits = new int[maxLength];
        for(int j = 0;j<maxLength;j++){
            if(j==0){
                newBits[j] = bits[j];
            }else{
                int bitSum = bits[j]+bits[j-1];
                newBits[j] = bitSum > 1 ? 0 : bitSum;

            }
            if(newBits[j] == 1){
                ans += Math.pow(2,maxLength - j - 1);
            }
        }
        System.out.println(ans);
        return ans;
    }



}
