package Grind75;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");
    }

    public int calculate(String s) {
        int ans = 0;
        int sign = 1;
        int number = 0;
        Stack<Integer> stk = new Stack<>();

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                number += (10*number)+ (int) (ch - '0');
            }else if(ch == '+'){
                ans += (sign*number);
                sign = 1;
                number = 0;
            }else if(ch == '-'){
                ans += (sign*number);
                sign = - 1;
                number = 0;
            }else if(ch == '('){
                stk.push(ans);
                stk.push(sign);
                ans = 0;
                sign = 1;
            }else if(ch == ')'){
                ans += (sign*number);
                number = 0;
                ans *= stk.pop();
                ans += stk.pop();
            }
        }

        if(number > 0) ans += (sign*number);

        return ans;
    }
}
