package DP.Memo;

import java.util.Arrays;

public class DistinctSubsequences {
    public static void main(String[] args) {
        System.out.println("Distinct Subsequences");
        System.out.println(numDistinct("babgbag","bag"));
    }

    public static int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] memo = new int[m][n];

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                memo[i][j] = -1;
            }
        }
        return calculate(s,m - 1,t,n - 1,memo);
    }

    public static int calculate(String s,int index1,String t,int index2,int[][] memo){
        if(index2 < 0) return 1;
        if(index1 < 0) return 0;

        if(memo[index1][index2] != -1) return memo[index1][index2];


        if(s.charAt(index1)==t.charAt(index2))
            memo[index1][index2] = calculate(s,index1 - 1,t,index2 - 1,memo) +
                    calculate(s,index1 - 1,t,index2,memo) ;
        else memo[index1][index2] = calculate(s,index1 - 1,t,index2,memo);

        return memo[index1][index2];
    }
}
