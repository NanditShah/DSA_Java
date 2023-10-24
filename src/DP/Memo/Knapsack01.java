package DP.Memo;

public class Knapsack01 {
    public static void main(String[] args) {
        System.out.println("0/1 Knapsack");
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        System.out.println(knapsack(weights, values, capacity)); // Expected output: 7

        int[] weights2 = {10, 20, 30 };
        int[] values2 = {60, 100, 120};
        int capacity2 = 50;
        System.out.println(knapsack(weights2, values2, capacity2)); // Expected output: 220

        int[] weights3 = {1, 2, 4, 5};
        int[] values3 = {5, 4, 8, 6};
        int capacity3 = 5;
        System.out.println(knapsack(weights3, values3, capacity3)); // Expected output: 13
    }

    public static int knapsack(int[] weights,int[] values,int capacity){
        if(capacity == 0 || weights.length == 0) return 0;
        int n = weights.length;

        int[][] memo = new int[n][capacity+1];

        for(int i = 0;i<n;i++){
            memo[i][0] = 0;
            for(int j = 1;j<=capacity;j++) memo[i][j] = -1;
        }

        return calculate(weights,values,capacity,memo,n - 1);
    }

    public static int calculate(int[] weights,int[] values,int capacity,int[][] memo,int index){
        if(memo[index][capacity] == -1) {
            if(index == 0)  memo[index][capacity] = weights[index] <= capacity ? values[index] : 0;
            else{
                int notTake = calculate(weights,values,capacity,memo,index - 1);
                int take = 0;
                if(weights[index] <= capacity) take = values[index]+calculate(weights,values,capacity - weights[index],memo,index - 1);
                memo[index][capacity] = Math.max(notTake,take);
            }
        }
        return memo[index][capacity];

    }
}
