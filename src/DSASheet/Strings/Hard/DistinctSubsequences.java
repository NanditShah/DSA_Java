package DSASheet.Strings.Hard;

import java.util.List;

public class DistinctSubsequences {
    public static void main(String[] args) {
        System.out.println("Distinct Subsequences");
        int numOfDistinctSubsequences = numDistinct("dbaaadcddccdddcadacbadbadbabbbcad","dadcccbaab");
        System.out.println(numOfDistinctSubsequences);
    }

    public static int numDistinct(String s, String t) {
        int n=s.length(),m=t.length();
        int[][] dp = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                dp[i][j] = -1;
            }
        }

        int ans = getNumOfDistinctSubSeq(n-1,m-1,s,t,dp);
        return ans;
    }

//    public static int getNumOfDistinctSubSeq(String s,String t,int start,String processed){
//        if(t.length() == processed.length()){
//            return t.equals(processed) ? 1 : 0;
//        }
//
//        int count = 0;
//
//        for(int i = start;i<s.length();i++){
//            return getNumOfDistinctSubSeq(s,t,i+1,processed) + getNumOfDistinctSubSeq(s,t,i+1,processed+s.charAt(i));
//        }
//        return 0;
//    }

    public static int getNumOfDistinctSubSeq(int i,int j,String s,String t,int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        //match case
        if(s.charAt(i)==t.charAt(j)){
            //two case :- Take both
            return dp[i][j] = getNumOfDistinctSubSeq(i-1,j-1,s,t,dp) + getNumOfDistinctSubSeq(i-1,j,s,t,dp) ;
        }
        else{
            return dp[i][j] = getNumOfDistinctSubSeq(i-1,j,s,t,dp);
        }
    }
}
