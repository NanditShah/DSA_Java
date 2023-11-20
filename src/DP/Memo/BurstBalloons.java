package DP.Memo;


import java.util.Arrays;

public class BurstBalloons {
    public static void main(String[] args) {
        System.out.println("Burst Balloons");
        System.out.println(maxCoins(new int[]{3,4,5}));
    }

    public static int maxCoins(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] newArr = new int[n+2];
        newArr[0] = 1;
        newArr[n+1] = 1;

        for(int i = 0;i<n;i++){
            newArr[i+1] = nums[i];
        }

        int[][] memo = new int[n+2][n+2];

        for(int[] arr : memo) Arrays.fill(arr,-1);
        return calculate(newArr,1,n,memo);
    }

    public static int calculate(int[] nums,int start,int end,int[][] memo){
        if(start > end) return 0;
        if(memo[start][end] != -1) return memo[start][end];
        int maxVal = Integer.MIN_VALUE;
        for(int k = start;k<=end;k++){
            int newPoints = (nums[start - 1] * nums[k] * nums[end + 1])
                    + calculate(nums,start,k - 1,memo) + calculate(nums,k+1,end,memo);
            maxVal = Math.max(newPoints,maxVal);
        }
        memo[start][end] = maxVal;
        return memo[start][end];
    }

}
