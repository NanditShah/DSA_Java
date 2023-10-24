package Grind75;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        System.out.println("Word Break");
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak("leetcode",wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()] = true;

        for(int i = s.length() - 1;i>=0;i--){
            for(String word : wordDict){
                if((i + word.length()) <= s.length() && s.substring(i,i+word.length()).equals(word)){
                    dp[i] = dp[i + word.length()];
                }
                if(dp[i]) break;
            }
        }
        return dp[0];
    }
}
