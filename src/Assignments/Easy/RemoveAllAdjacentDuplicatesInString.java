package Assignments.Easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println("Remove All Adjacent Duplicates In String");

        System.out.println(removeDuplicates("baaaaaaaaaaaaaaaab"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().equals(c)){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        s = "";

        StringBuilder sAns = new StringBuilder();

        while(!stack.isEmpty()){
            sAns.append(stack.pop());
        }

        return sAns.reverse().toString();
    }
}
