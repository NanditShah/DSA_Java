package DSASheet.DFS.Hard;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class RemoveInvalidParentheses {
    public static void main(String[] args) {
        System.out.println("Remove Invalid Parentheses");
    }

    public int getInvalidParentheses(String s){
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') stk.push(c);
            else if(c == ')'){
                if(!stk.isEmpty() && stk.peek() == '(') stk.pop();
                else stk.push(c);
            }
        }
        return stk.size();
    }

    public void dfs(String s,int parenthesesToRemove,HashSet<String> ansSet){
        if(parenthesesToRemove < 0) return;
        if(parenthesesToRemove == 0){
            if(getInvalidParentheses(s) == 0) ansSet.add(s);
            return;
        }
        for(int i =0;i<s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            dfs(left+right,parenthesesToRemove-1,ansSet);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String> ansSet = new HashSet<>();
        int invalidParentheses = getInvalidParentheses(s);
        dfs(s,invalidParentheses,ansSet);

        return ansSet.stream().toList();
    }

}
