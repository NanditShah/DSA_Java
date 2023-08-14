package DSASheet.Tree.Medium;

import java.util.Arrays;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        System.out.println("Unique Binary Search Trees");
    }

    public int numTrees(int n) {
        int[] meomizationArr = new int[n+1];
        Arrays.fill(meomizationArr,-1);

        return numTrees(n,meomizationArr);
    }

    private int numTrees(int n,int[] dp){
        if(n <= 1) return 1;
        if(dp[n] != -1) return dp[n];
        int ans = 0;
        for(int i =1;i<=n;i++){
            ans += numTrees(i - 1,dp) * numTrees(n-i,dp);
        }
        dp[n] = ans;
        return dp[n];
    }
}
