package Assignments.Easy;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        System.out.println("Maximum Nesting Depth of the Parentheses");
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }

    static int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                stack.push(c);
                if(stack.size() > maxDepth){
                    maxDepth = stack.size();
                }
            }else if(c == ')'){
                stack.pop();
            }
        }
        return maxDepth;
    }
}
