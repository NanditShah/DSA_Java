package Assignments.Easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println("Valid Parentheses");
        System.out.println(isValid("]()()()["));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                    if((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '[')){
                        stack.pop();
                    }else{
                        break;
                    }
                }else{
                    stack.push(c);
                    break;
                }
            }
        }

        return stack.isEmpty();
    }
}
