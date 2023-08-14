package DSASheet.Greedy.Medium;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println("Remove K Digits");
        System.out.println(removeKdigits("9",1));
    }

    public static String removeKdigits(String num, int k) {
        Stack<Integer> stk = new Stack<>();

        for(char c : num.toCharArray()){
            int n = c - '0';
            while(k > 0 && !stk.isEmpty() && stk.peek() > n){
                stk.pop();
                k--;
            }
            stk.push(n);
        }

        while(k > 0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }

        if(stk.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        for(int s : stk){
            if(sb.isEmpty() && s == 0){
                continue;
            }
            sb.append(s);
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
