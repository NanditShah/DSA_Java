package DSASheet.DFS.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Letter Combinations of a Phone Number");
        List<String> combinations = letterCombinations("2");
        System.out.println(combinations);
    }

    public static List<String> letterCombinations(String digits) {
        String[] digitToLetters = {"",    "",    "abc",  "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> letterCombinations = new ArrayList<>();

        dfs(digits,digitToLetters,letterCombinations,"");
        return letterCombinations;
    }

    public static void dfs(String digits,String[] digitToLetters, List<String> letterCombinations,String processed){
        if(digits.isEmpty()){
            if(!processed.isEmpty()){
                letterCombinations.add(processed);
            }
            return;
        }
        char[] charArr = digitToLetters[digits.charAt(0) - '0'].toCharArray();
        for(char ch : charArr) {
            dfs(digits.substring(1), digitToLetters, letterCombinations, processed + ch);
        }
    }
}
