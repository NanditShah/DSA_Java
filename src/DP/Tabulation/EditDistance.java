package DP.Tabulation;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println("Edit Distance");
    }

    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;

        int m = word1.length(),n = word2.length();

        if(m == 0) return n;
        if(n == 0) return m;

        int[][] dp = new int[m+1][n+1];

        for(int i = 0;i<=m;i++) dp[i][0] = i;
        for(int j = 0;j<=n;j++) dp[0][j] = j;

        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    int insert = 1 + dp[i][j - 1];
                    int delete = 1 + dp[i - 1][j];
                    int replace = 1 + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[m][n];
    }
}
