package Assignments.Easy;

import java.util.Arrays;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        System.out.println("Reverse Words in a String III");
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String[] strArr = s.split(" ");
        for(int i = 0;i<strArr.length;i++){
            strArr[i] = reserve(strArr[i]);
        }

        return String.join(" ",strArr);
    }

    static String reserve(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }


}
