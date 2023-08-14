package DSASheet.Stack.Medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println("Evaluate Reverse Polish Notation");
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st2 = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("*") || s.equals("/") || s.equals("-")){
                int b = st2.pop();
                int a = st2.pop();
                int res = cal(a, b, s.charAt(0));
                st2.push(res);

            } else {
                st2.push(Integer.parseInt(s));
            }
        }
        return st2.pop();
    }

    private int cal(int a, int b, char oprtr) {
        if(oprtr == '+'){
            return a + b;
        } else if(oprtr == '-'){
            return a - b;
        } else if(oprtr == '*'){
            return a * b;
        } else {
            return a / b;
        }
    }
}
