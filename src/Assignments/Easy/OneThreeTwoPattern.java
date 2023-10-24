package Assignments.Easy;

import java.util.Stack;

public class OneThreeTwoPattern {
    public static void main(String[] args) {
        System.out.println("132 Pattern");
    }


    public boolean find132pattern(int[] nums) {
        int n = nums.length;

        int[] minI = new int[n];
        minI[0] = nums[0];
        for(int i = 1;i<n;i++){
            minI[i] = Math.min(nums[i],minI[i-1]);
        }

        Stack<Integer> stack = new Stack<>();
        for(int j = n-1;j>=0;j--){
            if(nums[j] > minI[j]){
                while(!stack.isEmpty() && minI[j] >= stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty() && nums[j] > stack.peek()){
                    return true;
                }
                stack.push(nums[j]);
            }
        }
        return false;
    }
}
