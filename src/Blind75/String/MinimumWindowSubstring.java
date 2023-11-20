package Blind75.String;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println("Minimum Window Substring");
        String ans = minWindow("A","A");
        System.out.println(ans);
    }

    public static String minWindow(String s, String t) {
        if(t.length() == 0 || s.length() == 0 || t.length() > s.length()) return "";

        int[] counter = new int[256];
        int minLength = Integer.MAX_VALUE,startIndex = 0,count = 0;
        int start = 0,end = 0;
        for(char ch : t.toCharArray()) counter[(int) ch]++;

        while(end < s.length()){
            char currCharacter = s.charAt(end);
            if(counter[(int) currCharacter] > 0)
                count++;

            counter[(int) currCharacter] --;

            while(count == t.length()){
                if(minLength > (end - start + 1)) {
                    minLength = end - start + 1;
                    startIndex = start;
                }
                counter[(int) s.charAt(start)]++;
                if(counter[(int) s.charAt(start)] > 0) count--;
                start ++;
            }
            end ++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex,startIndex+minLength);
    }
}
