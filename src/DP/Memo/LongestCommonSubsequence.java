package DP.Memo;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println("Longest Common Subsequence");
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] memo = new int[m][n];

        for(int i = 0;i<m;i++) Arrays.fill(memo[i],-1);

        return calculate(memo,text1,m - 1,text2,n - 1);
    }

    public int calculate(int[][] memo,String text1,int index1,String text2,int index2){
        if(index1 < 0 || index2 < 0) return 0;
        if(memo[index1][index2] != -1) return memo[index1][index2];
        if(text1.charAt(index1) == text2.charAt(index2))
            memo[index1][index2] = 1 + calculate(memo,text1,index1 - 1,text2,index2 - 1);
        else
            memo[index1][index2] = Math.max(
                calculate(memo,text1,index1 - 1,text2,index2),
                calculate(memo,text1,index1,text2,index2 - 1)
        );
        return memo[index1][index2];
    }
}
