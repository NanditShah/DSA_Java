package Assignments.Easy;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        System.out.println("Basic Calculator II");
        System.out.println(calculate("3+2*2"));
    }

    static int calculate(String s) {
        s = s.trim();
        Stack<Integer> st = new Stack<>();
        int curr = 0;
        int ans = 0;
        char op = '+';
        char[] charArr = s.toCharArray();
        for(int i =0;i<charArr.length;i++){
            char currChar = charArr[i];
            if(Character.isDigit(currChar)){
                curr = curr*10 + currChar - '0';
            }

            if((!Character.isDigit(currChar) && currChar != ' ' )|| (i == charArr.length-1)){
                if(op == '+'){
                    st.push(curr);
                }else if(op == '-'){
                    st.push(-curr);
                }else if(op == '*'){
                    int lastEle = st.pop();
                    st.push(lastEle*curr);
                }else if(op == '/'){
                    int lastEle = st.pop();
                    st.push(lastEle/curr);
                }
                op = currChar;
                curr = 0;
            }
        }

        while (!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}
