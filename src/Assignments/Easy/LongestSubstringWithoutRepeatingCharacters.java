package Assignments.Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Longest Substring Without Repeating Characters");
        System.out.println(lengthOfLongestSubstring("au"));
    }

    static int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }
        char[] arr = s.toCharArray();
        int maxLen = 1;
        Set<Character> subStr = new HashSet<>();

        for(int i = 0;i<arr.length;i++){
            char c = arr[i];
            if(subStr.contains(Character.toLowerCase(c))){
                if(subStr.size() > maxLen){
                    maxLen = subStr.size();
                }
                subStr.clear();
            }
            subStr.add(c);
        }
            if(subStr.size() > maxLen){
                maxLen = subStr.size();
            }
        return maxLen;
    }
}
