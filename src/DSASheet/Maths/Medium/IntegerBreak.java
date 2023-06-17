package DSASheet.Maths.Medium;

import java.util.HashMap;

public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println("Integer Break");
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int ans = dfs(n,n,dp);
        return ans;
    }

    public static  int dfs(int actualNum,int num,int[] dp){
        if(dp[num] != 0){
            return dp[num];
        }

        dp[num] = num == actualNum ? 0 : num;

        for(int i = 1;i<num;i++){
            int val = dfs(actualNum,i,dp)*dfs(actualNum,num - i,dp);
            dp[num] = Math.max(dp[num],val);
        }
        return dp[num];
    }
}
