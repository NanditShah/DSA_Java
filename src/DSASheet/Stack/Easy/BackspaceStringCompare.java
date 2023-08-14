package DSASheet.Stack.Easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println("Backspace String Compare");
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {
        if(s.equals(t)) return true;
        String s1 = generateTextEditorString(s);
        String s2 = generateTextEditorString(t);
        System.out.println(s1);
        System.out.println(s2);
        return s1.equals(s2);
    }

    public static String generateTextEditorString(String s){
        Stack<Character> stk = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '#' && !stk.isEmpty()){
                stk.pop();
            }else if(ch != '#'){
                stk.push(ch);
            }
        }

        String ans = "";
        for(Character ch : stk){
            ans += ch+"";
        }
        return ans;
    }
}
