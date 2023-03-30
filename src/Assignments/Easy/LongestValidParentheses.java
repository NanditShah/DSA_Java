package Assignments.Easy;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println("Longest Valid Parentheses");
    }

    public int longestValidParentheses(String s) {
        if(s.length() < 2){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int max = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int length = i - stack.peek();
                    max = Math.max(max,length);
                }
            }
        }

        return max;
    }
}
