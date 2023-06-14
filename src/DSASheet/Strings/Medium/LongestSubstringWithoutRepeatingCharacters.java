package DSASheet.Strings.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Longest Substring Without Repeating Characters");
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();

        char[] charArr = s.toCharArray();

        Set<Character> strSet = new HashSet<>();
        int maxLen = 0;

        for(int i = 0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                char ch = charArr[j];
                if(strSet.contains(Character.toLowerCase(ch))){
                    break;
                }
                strSet.add(ch);
            }

            maxLen = Math.max(maxLen,strSet.size());
            strSet.clear();
        }
        maxLen = Math.max(maxLen,strSet.size());

        return maxLen;
    }
}
