package Grind75;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println("Evaluate Reverse Polish Notation");
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                int ans = calculate(num1,num2,token);
                stk.push(ans);
            }else{
                stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();
    }

    public int calculate(int num1,int num2,String operator){
        switch (operator){
            case "+" : return num1 + num2;
            case "-" : return num1 - num2;
            case "*" : return num1 * num2;
            case "/" : return num1 / num2;
        }
        return -1;
    }
}
