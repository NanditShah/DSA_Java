package Assignments.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class LongestStringChain {
    public static void main(String[] args) {
        System.out.println("Longest String Chain");
    }

    public int longestStrChain(String[] words) {
        HashMap<String,Integer> dp = new HashMap<>();

        Arrays.sort(words,(a,b) -> a.length() - b.length());
        for(String word : words){
            for(int i = 0;i<word.length();i++){
                String predecessor = word.substring(0,i) + word.substring(i+1);
                dp.put(word,Math.max(dp.getOrDefault(word,0),dp.getOrDefault(predecessor,0)+1));
            }
        }

        int ans = Integer.MIN_VALUE;
        for(int value : dp.values()){
            ans = Math.max(ans,value);
        }
        return ans;
    }
}
