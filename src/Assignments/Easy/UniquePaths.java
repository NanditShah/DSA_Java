package Assignments.Easy;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println("Unique Paths");
        System.out.println(uniquePaths(3,2));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return getPathCounts(0,0,m,n,dp);
    }

    private static int getPathCounts(int row,int col,int m, int n, int[][] dp) {
        if(row == m - 1 && col == n - 1){
            return 1;
        }
        if(row >= m || col >= n){
            return 0;
        }

        if(dp[row][col] != -1) return dp[row][col];

        dp[row][col] = getPathCounts(row+1,col,m,n,dp)+getPathCounts(row,col+1,m,n,dp);
        return dp[row][col];
    }
}
