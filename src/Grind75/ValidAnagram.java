package Grind75;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Valid Anagram");
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> sCharCount = new HashMap<>();
        for(char ch : s.toCharArray()){
            sCharCount.put(ch,sCharCount.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(!sCharCount.containsKey(ch)) return false;
            if(sCharCount.get(ch) == 1) sCharCount.remove(ch);
            else sCharCount.put(ch,sCharCount.get(ch) - 1);
        }
        return sCharCount.size() == 0;
    }
}
