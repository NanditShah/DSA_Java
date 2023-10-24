package Grind75;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Letter Combinations of a Phone Number");
        List<String> ans = letterCombinations("23");
        System.out.println(ans);
    }

    static String[] digitsToChars = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        generateCombinations(digits,0,ans,"");
        return ans;
    }

    private static void generateCombinations(String digits, int start, List<String> combinations,String word) {

        if(start == digits.length() && word.length() == digits.length()){
            combinations.add(word);
            return;
        }

        for(int i = start;i<digits.length();i++){
            char digit = digits.charAt(i);
            for(char letter : digitsToChars[digit - '0'].toCharArray()){
                generateCombinations(digits,i+1,combinations,word+letter);
            }
        }
    }
}
