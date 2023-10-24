package Grind75;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println("Longest Palindrome");
        System.out.println(longestPalindrome("a"));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        int ans = 0;
        boolean isOddUsed = false;

        for(char ch : s.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }

        for(int value : charCount.values()){
            if(value  % 2 == 0){
                ans += value;
            }else{
                if(!isOddUsed){
                    ans += value;
                    isOddUsed = true;
                }else{
                    ans += (value - 1);
                }
            }
        }
        return ans;
    }
}
