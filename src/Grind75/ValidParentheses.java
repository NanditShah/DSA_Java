package Grind75;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Valid Parentheses");
        System.out.println(isValid("(){}[](())"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{') stk.push(ch);
            else{
                if(stk.isEmpty()) return false;
                else{
                    Character topChar = stk.peek();
                    if((topChar == '(' && ch == ')') || (topChar == '{' && ch == '}') || (topChar == '[' && ch == ']')){
                        stk.pop();
                        continue;
                    }else break;
                }
            }
        }

        return stk.isEmpty();
    }
}
