package DP.Tabulation;

public class WildcardMatching {
    public static void main(String[] args) {
        System.out.println("Wildcard Matching");
        System.out.println(isMatch("abcdxyz","*****z"));
    }

    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();

        if(p.equals("*")) return true;
        boolean[][] dp = new boolean[m+1][n+1];

//        base-case - 1
        dp[0][0] = true;

//        base-case - 2
        for(int i = 1;i<=n;i++){
            if(p.charAt(i - 1) != '*') break;
            dp[0][i] = true;
        }


        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                    dp[i][j] = dp[i - 1][j - 1];
                else if(p.charAt(j - 1) == '*')
                    dp[i][j] =  dp[i-1][j] || dp[i][j - 1];
                else dp[i][j] = false;
            }
        }
        return dp[m][n];
    }
}
