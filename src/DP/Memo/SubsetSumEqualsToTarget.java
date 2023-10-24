package DP.Memo;

public class SubsetSumEqualsToTarget {
    public static void main(String[] args) {
        System.out.println("Subset Sum Equals to Target");

        int[] arr = {12, 1, 61, 5, 9, 2};
        System.out.println(subsetSumToK(arr.length,61,arr));
    }

    public static boolean subsetSumToK(int n,int k,int[] arr){
        int[][] memo = new int[n][k+1];

        for(int i = 0;i<n;i++){
            memo[i][0] = 1;
            for(int j = 1;j<=k;j++) memo[i][j] = -1;
        }

        return calculate(n-1,k,memo,arr);
    }

    public static boolean calculate(int index,int target,int[][] memo,int[] arr){
        if(memo[index][target] != -1) return memo[index][target] == 1;
        if(index == 0) memo[index][target] = arr[index] == target ? 1 : 0;
        else{
            boolean notTake = calculate(index - 1,target,memo,arr);
            boolean take = false;
            if(!notTake && arr[index] <= target) take = calculate(index - 1,target - arr[index],memo,arr);
            memo[index][target] = (notTake || take) ? 1 : 0;
        }
        return memo[index][target] == 1;
    }
}
