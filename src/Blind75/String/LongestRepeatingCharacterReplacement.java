package Blind75.String;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println("Longest Repeating Character Replacement");
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int left = 0,right = 0,maxF = 0,ans = 0;

        while(right < s.length()){
            char currCh = s.charAt(right);
            hmap.put(currCh,hmap.getOrDefault(currCh,0)+1);
            maxF = Math.max(maxF,hmap.get(currCh));
            while((right - left + 1) - maxF > k){
                char leftCh = s.charAt(left);
                hmap.put(leftCh,hmap.get(leftCh) - 1);
                left++;
            }
            ans = Math.max(ans,right - left + 1);
            right++;
        }
        return ans;
    }
}
