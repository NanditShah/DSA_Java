package Assignments.Easy;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public static void main(String[] args) {
        System.out.println("Number of Subsequences That Satisfy the Given Sum Condition");

        System.out.println(numSubseq(new int[] {14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,
            11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14},22));
    }

    public static int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = n - 1;

        int ans = 0;

        int mod = (int)1e9 + 7;

        var exp = new int[n];
        exp[0] = 1;

        for (var i=1; i<n; i++)
            exp[i] = (exp[i-1] * 2) % mod;

        while(left <= right){
            if(nums[left]+nums[right] <= target){
                ans = (ans + exp[right - left]) % mod;
                left++;
            }else{
                right --;
            }
        }
        return ans;
    }
}
