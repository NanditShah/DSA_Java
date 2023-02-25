package Assignments.Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Longest Substring Without Repeating Characters");
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    static int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }
        char[] arr = s.toCharArray();
        int maxLen = 1;
        Set<Character> subStr = new HashSet<>();

        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                char c = arr[j];
                if(subStr.contains(Character.toLowerCase(c))){
                    break;
                }
                subStr.add(c);
            }
            if(subStr.size() > maxLen){
                maxLen = subStr.size();
            }
            subStr.clear();
        }
        if(subStr.size() > maxLen){
            maxLen = subStr.size();
        }
        return maxLen;
    }
}
