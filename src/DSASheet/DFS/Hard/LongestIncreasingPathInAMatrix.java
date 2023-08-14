package DSASheet.DFS.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingPathInAMatrix {
    public static void main(String[] args) {
        System.out.println("Longest Increasing Path in a Matrix");

        int[][] matrix = {
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };

        int length = longestIncreasingPath(matrix);
        System.out.println(length);
    }

    static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public static int longestIncreasingPath(int[][] matrix) {
        int x = 0,y = 0,m = matrix.length,n = matrix[0].length;

        int dp[][] = new int[m][n];
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                ans = Math.max(ans,dfs(i,j,dp,matrix));
            }
        }
        return ans;
    }

    public static int dfs(int i,int j,int[][] dp,int[][] matrix){
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return 0;

        if(dp[i][j] != 0) {
            return dp[i][j];
        }

        int res = 1;
        for(int[]dir : dirs){
            int _i = i + dir[0];
            int _j = j + dir[1];
            if(_i >= 0 && _i < matrix.length && _j >= 0 && _j < matrix[0].length && matrix[_i][_j] > matrix[i][j]){
                res = Math.max(res,1+dfs(_i, _j, dp, matrix));
            }
        }
        dp[i][j] = res;
        return res;
    }
}
