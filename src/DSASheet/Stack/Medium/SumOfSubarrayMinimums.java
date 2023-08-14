package DSASheet.Stack.Medium;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        System.out.println("Sum of Subarray Minimums");
        int ans = sumSubarrayMins(new int[] {11,81,94,43,3});
        System.out.println(ans);
    }

    public static int sumSubarrayMins(int[] arr) {
        long mod = (long)1e9 + 7;
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        Stack<Integer> stk = new Stack<>();

        Arrays.fill(leftMin,-1);
        Arrays.fill(rightMin,n);

        for(int i = 0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                stk.pop();
            }
            leftMin[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }

        stk.clear();

        for(int i = n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                stk.pop();
            }
            rightMin[i] = stk.isEmpty() ? arr.length : stk.peek();
            stk.push(i);
        }

        int ans = 0;
        for(int i =0;i<arr.length;i++){
            int left = (i - leftMin[i]);
            int right = (rightMin[i] - i);
            long curr = (long) ( left * right * arr[i]) % mod;
            ans += curr;
            ans %= mod;
        }
        return (int)ans;
    }

}
