package Assignments.Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        System.out.println("Longest Nice Substring");
    }

    static String longestNiceSubstring(String s) {
        if(s.length() < 2) return "";
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char c : arr) set.add(c);

        for(int i = 0;i<arr.length;i++){
            char c = arr[i];
            if(set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c))){
                continue;
            }
            String subStr1 = longestNiceSubstring(s.substring(0,i));
            String subStr2 = longestNiceSubstring(s.substring(i+1));
            return subStr2.length() > subStr1.length() ? subStr2 : subStr1;
        }
        return s;
    }
}
