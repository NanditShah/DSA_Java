package Blind75.String;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("Valid Anagram");
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> counter = new HashMap<>();

        for(char ch : s.toCharArray()) counter.put(ch,counter.getOrDefault(ch,0)+1);

        for(char ch : t.toCharArray()){
            if(!counter.containsKey(ch)) return false;
            if(counter.get(ch) == 1) counter.remove(ch);
            else counter.put(ch, counter.get(ch) - 1);
        }
        return counter.size() == 0;
    }
}
