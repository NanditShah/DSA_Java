package DSASheet.Strings.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println("Generate Parentheses");
        List<String> ans = generateParenthesis(3);
        for(String s : ans){
            System.out.print(s+",");
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if(n == 1) {
            ans.add("()");
        }else{
            Stack<String> stk = new Stack<>();
            backtracking(0,0,stk,ans,n);
        }
        return ans;
    }

    public static void backtracking(int openNo,int closeNo,Stack<String> stk,List<String> ans,int n){
        if(openNo == closeNo && closeNo == n){
            ans.add(String.join("",stk));
        }

        if(openNo < n){
            stk.add("(");
            backtracking(openNo+1,closeNo,stk,ans,n);
            stk.pop();
        }

        if(closeNo < openNo){
            stk.add(")");
            backtracking(openNo,closeNo+1,stk,ans,n);
            stk.pop();
        }
    }
}
