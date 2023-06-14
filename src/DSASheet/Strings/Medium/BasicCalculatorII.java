package DSASheet.Strings.Medium;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println("Basic Calculator II");

        int ans = calculate("3+2 * 2");
        System.out.println(ans);
    }

    public static int calculate(String s) {
        s = s.trim();
        char[] charArr = s.toCharArray();
        int curr = 0;
        char op = '+';
        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<charArr.length;i++){
            char currChar = charArr[i];
            if(Character.isDigit(currChar)){
                curr = curr * 10 + (currChar - '0');
            }

            if((!Character.isDigit(currChar) && currChar != ' ') || i == charArr.length - 1){
                if(op == '+'){
                    stk.add(curr);
                }else if(op == '-'){
                    stk.add(-curr);
                }else if(op == '*'){
                    int lastEle = stk.pop();
                    stk.add(lastEle * curr);
                }else if(op == '/'){
                    int lastEle = stk.pop();
                    stk.add(lastEle/curr);
                }

                curr = 0;
                op = currChar;
            }
        }
        int ans = 0;
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}
