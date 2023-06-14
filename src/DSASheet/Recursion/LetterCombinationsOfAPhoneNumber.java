package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Letter Combinations of a Phone Number");
        List<String> combinations = letterCombinations("23");
        System.out.println(combinations);
    }

    public static List<String> letterCombinations(String digits) {
        final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = getLetterCombinationsList("",digits,digitToLetters);
        return ans;
    }

    public static List<String> getLetterCombinationsList(String processed,String unProcessed,String[] digitToLetters) {
        if(unProcessed.isEmpty()){
            List<String> ans = new ArrayList<>();
            if(!processed.isEmpty()){
                ans.add(processed);
            }
            return ans;
        }

        char[] charArr = digitToLetters[unProcessed.charAt(0) - '0'].toCharArray();
        List<String> ans = new ArrayList<>();
        for(char ch : charArr){
            ans.addAll(getLetterCombinationsList(processed+ch,unProcessed.substring(1),digitToLetters));
        }
        return ans;
    }
}
