package Grind75;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println("Minimum Window Substring");
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        HashMap<Character,Integer> countT = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();

        for(char ch : t.toCharArray()){
            countT.put(ch,countT.getOrDefault(ch,0)+1);
        }

        int have = 0, need = countT.size();
        int l = 0;
        int[] res = {-1,-1};
        float resLen = Float.MAX_VALUE;

        for(int r = 0;r<s.length();r++){
            char rightCh = s.charAt(r);
            window.put(rightCh,window.getOrDefault(rightCh,0)+1);
            if(countT.containsKey(rightCh) && countT.get(rightCh) == window.get(rightCh)){
                have += 1;
            }

            while(have == need && l < s.length()){
                if((r - l + 1) < resLen){
                    resLen = (r - l + 1);
                    res = new int[] {l,r};
                }
                char leftCh = s.charAt(l);
                window.put(leftCh,window.get(leftCh)-1);
                if(countT.containsKey(leftCh) && window.get(leftCh) < countT.get(leftCh)) have -=1;
                l++;
            }
        }

        return resLen != Float.MAX_VALUE ? s.substring(res[0],res[1]+1) : "";
    }
}
