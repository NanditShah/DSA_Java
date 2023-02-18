package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Letter Combinations of a Phone Number");
        List<String> ans = letterCombinations("23");
        System.out.println(ans);
    }

    static void printLetterCombinations(String digits) {
        getLetterCombinationsList("",digits);
    }

    static void getLetterCombinationsList(String processed,String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char[] chars = digitToLetters[unProcessed.charAt(0) - '0'].toCharArray();
        for (char ch : chars) {
            getLetterCombinationsList(processed + ch, unProcessed.substring(1));
        }
    }
    static List<String> letterCombinations(String digits) {
        final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = getLetterCombinationsList("",digits,digitToLetters);
        return ans;
    }

    static List<String> getLetterCombinationsList(String processed,String unProcessed,String[] digitToLetters) {
        if (unProcessed.isEmpty()) {
            List<String> ans = new ArrayList<>();
            if(!processed.isEmpty()){
                ans.add(processed);
            }
            return ans;
        }

        char[] chars = digitToLetters[unProcessed.charAt(0) - '0'].toCharArray();
        List<String> ans = new ArrayList<>();
        for (char ch : chars) {
            ans.addAll(getLetterCombinationsList(processed + ch, unProcessed.substring(1),digitToLetters));
        }
        return ans;
    }
}
