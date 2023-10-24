package Grind75;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println("Longest Repeating Character Replacement");
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int left = 0, right = 0;
        int maxF = 0;
        int res = 0;
        for(right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            maxF = Math.max(maxF,hmap.get(ch));

            while((right - left + 1) - maxF > k){
                char leftCh = s.charAt(left);
                hmap.put(leftCh,hmap.get(leftCh) - 1);
                left++;
            }
            res = Math.max(res,right - left + 1);
        }
        return res;
    }
}
