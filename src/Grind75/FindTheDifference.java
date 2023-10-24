package Grind75;

import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println("Find the Difference");
    }

    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> counter = new HashMap<>();

        for(char ch : s.toCharArray()){
            counter.put(ch,counter.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(!counter.containsKey(ch)) return ch;
            else if(counter.get(ch) == 1) counter.remove(ch);
            else counter.put(ch,counter.get(ch) - 1);
        }

        return 'a';
    }
}
