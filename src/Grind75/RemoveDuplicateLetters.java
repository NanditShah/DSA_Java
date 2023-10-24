package Grind75;

import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println("Remove Duplicate Letters");
    }

    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex, -1);
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        Stack<Character> stk = new Stack<>();
        boolean[] seen = new boolean[26];

        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(seen[ch - 'a']) continue;
            while(!stk.isEmpty() && stk.peek() > ch && lastIndex[stk.peek()] > i){
                char poppedElement = stk.pop();
                seen[poppedElement - 'a'] = false;
            }
            stk.push(ch);
            seen[ch - 'a'] = true;
        }


        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        return sb.reverse().toString();
    }
}
