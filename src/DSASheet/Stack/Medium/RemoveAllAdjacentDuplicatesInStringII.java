package DSASheet.Stack.Medium;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInStringII {
    public static void main(String[] args) {
        System.out.println("Remove All Adjacent InStringII");

        System.out.println(removeDuplicates("deeedbbcccbdaa",3));
    }

    static class CharacterFreq {
        char ch;
        int freq;

        public CharacterFreq(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public static String removeDuplicates(String s, int k) {
        Stack<CharacterFreq> stk = new Stack<CharacterFreq>();

        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek().ch == ch){
                stk.peek().freq++;
            }else{
                stk.push(new CharacterFreq(ch,1));
            }
            if(stk.peek().freq == k){
                stk.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (CharacterFreq chf : stk) {
            sb.append(String.valueOf(chf.ch).repeat(chf.freq));
        }
        return sb.toString();
    }
}
