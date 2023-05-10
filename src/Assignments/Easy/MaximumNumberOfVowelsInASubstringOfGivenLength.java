package Assignments.Easy;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        System.out.println("Maximum Number of Vowels in a Substring of Given Length");
    }

    public int maxVowels(String s, int k) {
        int r = 0,l = 0,ans = 0,windowVowelCount = 0;

        for(;r<k;r++){
            windowVowelCount += isVowel(s.charAt(r));
        }

        ans = windowVowelCount;

        while(r < s.length()){
            windowVowelCount -= isVowel(s.charAt(l++));
            windowVowelCount += isVowel(s.charAt(r++));
            ans = Math.max(ans,windowVowelCount);
        }
        return ans;
    }

    public int isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return 1;
        return 0;
    }
}
