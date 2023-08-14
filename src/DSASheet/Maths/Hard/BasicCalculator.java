package DSASheet.Maths.Hard;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");
//        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    public static int calculate(String s) {
        int sign = 1;
        int sum = 0;
        s = s.strip();
        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            // Number
            if(Character.isDigit(ch)){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = (num * 10) + (s.charAt(i) - '0');
                    i++;
                }
                sum += (sign * num);
                i--;
            }
            // +
            else if(ch == '+'){
                sign = 1;
            }
            // -
            else if(ch == '-'){
                sign = -1;
            }
            // (
            else if(ch == '('){
                stk.push(sum);
                stk.push(sign);
                sign = 1;
                sum = 0;
            }
            // )
            else if(ch == ')'){
                    sum *= stk.pop();
                    sum += stk.pop();
            }
        }
        return sum;
    }
}
