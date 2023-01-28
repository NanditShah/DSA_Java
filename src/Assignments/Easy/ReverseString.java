package Assignments.Easy;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Reverse String");
        char[] chars = {'H','a','n','N','A','h'};
        System.out.println(Arrays.toString(chars));
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
    static void reverseString(char[] s) {
        int start = 0,end = s.length-1;
        reverse(s,start,end);
    }

    static void reverse(char[] s,int from,int to){
        if(from >= to){
            return;
        }else{
            swapChars(s,from,to);
            reverse(s,from+1,to - 1);
        }
    }

    static void swapChars(char[] s,int from,int to){
        char temp = s[from];
        s[from] = s[to];
        s[to] = temp;
    }
}
