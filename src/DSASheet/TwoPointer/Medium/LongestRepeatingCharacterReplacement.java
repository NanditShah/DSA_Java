package DSASheet.TwoPointer.Medium;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println("Longest Repeating Character Replacement");
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> characterSet = new HashMap<>();
        int i = 0;
        int maxF = 0; // Most frequent character (character with most frequent element)
        int res = 0;
        for(int j = 0;j<s.length();j++){
            int currFreq = characterSet.getOrDefault(s.charAt(j),0) + 1;
            characterSet.put(s.charAt(j),currFreq);
            maxF = Math.max(currFreq,maxF);
            while(((j - i + 1) - maxF) > k && i <= j){
                characterSet.put(s.charAt(i),characterSet.getOrDefault(s.charAt(i),0) - 1);
                i++;
            }
            res = Math.max(res,j - i + 1);

        }
        return res;
    }
}
