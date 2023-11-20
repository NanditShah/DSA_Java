package DP.Memo;

import java.util.Arrays;

public class WildcardMatching {
    public static void main(String[] args) {
        System.out.println("Wildcard Matching");
        System.out.println(isMatch("abcdxyz","*xyz"));
    }

    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        if(p.equals("*")) return true;

        int[][] memo = new int[m][n];

        for(int[] arr : memo) Arrays.fill(arr,-1);

        return calculate(s,m - 1,p,n - 1,memo);
    }

    public static boolean calculate(String s, int index1,String pattern,int index2,int[][] memo){
//        base case
        if(index1 < 0 && index2 < 0) return true;
        if(index1 >= 0 && index2 < 0) return false;
        if(index1 < 0 && index2 >= 0) {
            while(index2 >= 0) {
                if (pattern.charAt(index2) != '*') return false;
                index2--;
            }
            return true;
        }

        if(memo[index1][index2] != -1) return memo[index1][index2] == 1;

        if(s.charAt(index1) == pattern.charAt(index2) || pattern.charAt(index2) == '?')
            memo[index1][index2] = calculate(s,index1 - 1,pattern,index2 - 1,memo) ? 1 : 0;
        else if(pattern.charAt(index2) == '*')
            memo[index1][index2] =  (
                    calculate(s, index1 - 1, pattern, index2, memo) ||
                    calculate(s, index1, pattern, index2 - 1,memo)
            ) ? 1 : 0;
        else memo[index1][index2] = 0;
        return memo[index1][index2] == 1;
    }
}
