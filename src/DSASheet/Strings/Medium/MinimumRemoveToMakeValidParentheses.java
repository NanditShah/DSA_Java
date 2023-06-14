package DSASheet.Strings.Medium;

import java.util.ArrayList;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        System.out.println("Minimum Remove to Make Valid Parentheses");
    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        char[] charArr = s.toCharArray();
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<charArr.length;i++){
            if(charArr[i] == '('){
                stk.add(i);
            }else if(charArr[i] == ')'){
                if(!stk.isEmpty()){
                    stk.pop();
                }else{
                    charArr[i] = '!';
                }
            }
        }

        while(!stk.isEmpty()){
            charArr[stk.pop()] = '!';
        }

        String result = "";
        for(char ch : charArr){
            if(ch != '!') result += ch;
        }

        return result;
    }
}
