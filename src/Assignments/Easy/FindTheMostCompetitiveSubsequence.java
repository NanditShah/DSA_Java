package Assignments.Easy;

import java.util.Arrays;
import java.util.Stack;

public class FindTheMostCompetitiveSubsequence{
    public static void main(String[] args) {
        System.out.println("Find the Most Competitive Subsequence");

        int[] ansArr = mostCompetitive(new int[] {71,18,52,29,55,73,24,42,66,8,80,2},3);
        System.out.println(Arrays.toString(ansArr));
    }

    public static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int spacesLeft = nums.length - k;

        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() > num && spacesLeft > 0){
                stack.pop();
                spacesLeft --;
            }
            stack.push(num);
        }

        while(spacesLeft > 0){
            stack.pop();
            spacesLeft--;
        }

        int[] ans = new int[k];
        int i = k-1;
        while(!stack.isEmpty()){
            ans[i] = stack.pop();
            i--;
        }

        return ans;
    }
}
