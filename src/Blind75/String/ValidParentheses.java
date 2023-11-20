package Blind75.String;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println("Valid Parentheses");
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        if(s.length() == 0) return true;
        char[] charArr = s.toCharArray();

        Stack<Character> stk = new Stack<>();

        for(char ch : charArr){
            if(")}]".indexOf(ch) != -1){
                if(stk.isEmpty()) return false;
                char topChar = stk.pop();
                if(ch == ')' && topChar != '(') return false;
                if(ch == '}' && topChar != '{') return false;
                if(ch == ']' && topChar != '[') return false;
            }else stk.push(ch);
        }
        return stk.isEmpty();
    }
}
