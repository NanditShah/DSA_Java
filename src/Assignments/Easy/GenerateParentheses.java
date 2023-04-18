package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println("Generate Parentheses");

        Stack<String> s = new Stack<>();
        s.add("(");
        s.add(")");
        System.out.println(String.join("",s));
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if(n == 1){
            ans.add("()");
        }else{
            Stack<String> stringStack = new Stack<>();
            generateParenthesisHelper(0,0,n,stringStack,ans);
        }
        return ans;
    }


    public void generateParenthesisHelper(int openingN,int closingN,int n,Stack<String> stringStack,List<String> ans){
        if(openingN == closingN && openingN == n){
            ans.add(String.join("",stringStack));
        }

        if(openingN < n){
            stringStack.push("(");
            generateParenthesisHelper(openingN+1,closingN,n,stringStack,ans);
            stringStack.pop();
        }

        if(closingN < openingN){
            stringStack.push(")");
            generateParenthesisHelper(openingN,closingN+1,n,stringStack,ans);
            stringStack.pop();
        }
    }
}
