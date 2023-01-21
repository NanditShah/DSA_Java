package Assignments.Easy;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println("Reverse Prefix of Word");
    }

    static String reversePrefix(String word, char ch) {
            int charIndex = word.indexOf(ch);
            if(charIndex == -1){
                return word;
            }

            String ans = new StringBuilder(word.substring(0,charIndex+1)).reverse().toString()+word.substring(charIndex+1);
            return ans;
    }
}
