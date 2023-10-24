package Grind75;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println("Backspace String Compare");
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {
        if(s.equals(t)) return true;

        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();


        for(char ch : s.toCharArray()){
            if(ch == '#' && !stk1.isEmpty()){
                stk1.pop();
            }else if(ch != '#') stk1.push(ch);
        }

        for(char ch : t.toCharArray()){
            if(ch == '#' && !stk2.isEmpty()){
                stk2.pop();
            }else if(ch != '#') stk2.push(ch);
        }

        String s1 = "";
        while(!stk1.isEmpty()){
            s1 += ((stk1.pop())+"");
        }

        String s2 = "";
        while(!stk2.isEmpty()){
            s2 += ((stk2.pop())+"");
        }

        return s1.equals(s2);
    }
}
