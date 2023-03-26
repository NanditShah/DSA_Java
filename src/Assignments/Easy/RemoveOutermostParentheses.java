package Assignments.Easy;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        System.out.println("Remove Outermost Parentheses");

        System.out.println(removeOuterParentheses("(()())(())"));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ansString = "";

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                if(stack.size() != 1){
                    ansString += c;
                }
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    ansString += c;
                }
            }
        }

        return ansString;
    }
}
