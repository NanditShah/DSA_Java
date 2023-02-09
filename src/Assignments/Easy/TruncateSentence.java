package Assignments.Easy;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println("Truncate Sentence");
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }

    static String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");

        String ansString = "";
        for(int i=0;i<arr.length;i++){
            if(i < k){
                ansString += arr[i];
                if(i != k-1){
                    ansString += " ";
                }
            }
        }
        return ansString;
    }
}
