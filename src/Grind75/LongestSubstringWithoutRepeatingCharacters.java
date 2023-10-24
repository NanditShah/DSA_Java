package Grind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Longest Substring Without Repeating Characters");
        System.out.println(lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();

        int left = 0, right = 0;
        HashMap<Character,Integer> charFreqMap = new HashMap<>();
        int maxLength = (right - left)+1;
        while(right < s.length()){
            char chatAtEnd = s.charAt(right);
            charFreqMap.put(chatAtEnd,charFreqMap.getOrDefault(chatAtEnd,0)+1);
            while(charFreqMap.get(chatAtEnd) != 1){
                char chatAtLeft = s.charAt(left);
                charFreqMap.put(chatAtLeft,charFreqMap.get(chatAtLeft)-1);
                left++;
            }
            maxLength = Math.max(maxLength,(right - left) + 1);
            right++;
        }
        return maxLength;
    }
}
