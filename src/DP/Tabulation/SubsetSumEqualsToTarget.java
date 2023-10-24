package DP.Tabulation;

public class SubsetSumEqualsToTarget {
    public static void main(String[] args) {
        System.out.println("Subset Sum Equals to Target");

        int[] arr = {12, 1, 61, 5, 9, 2};
        System.out.println(subsetSumToK(arr.length,61,arr));
    }

    public static boolean subsetSumToK(int n,int k,int[] arr) {
        boolean[][] dp = new boolean[n][k+1];
        for(int i = 0;i<n;i++) dp[i][0] = true;

        dp[0][arr[0]] = true;

        for(int i = 1;i<n;i++){
            for(int j = 1;j<=k;j++){
                boolean notTake = dp[i - 1][k];
                boolean take = false;
                if(!notTake && arr[i] <= j) take = dp[i][j - arr[i]];
                dp[i][j] = notTake || take;
            }
        }
        return dp[n - 1][k];
    }
}
