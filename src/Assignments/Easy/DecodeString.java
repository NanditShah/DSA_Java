package Assignments.Easy;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println("Decode String");
//        decodeString("3[a2[c]]");
        decodeUsingStack("3[a2[c]]");
    }

    static int i = 0;
    static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        while(i < s.length() && s.charAt(i) != ']'){
            if(Character.isDigit(s.charAt(i))){
                int k = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i)))
                    k = k*10 + s.charAt(i++) - '0';
                i++;
                String r = decodeString(s);
                while(k-- > 0)
                    result.append(r);
                i++;
            } else
                result.append(s.charAt(i++));
        }
        return result.toString();
    }

    static String processString(char currChar,String unProcessed,int numOfTimes,
                              String toAppend){

        if(Character.isDigit(currChar)){
            numOfTimes = currChar - '0';
            toAppend = "";
        }
        if(currChar == '['){
            toAppend = "";
        }
        if(Character.isAlphabetic(currChar)){
            toAppend += currChar;
        }

        String ans = "";
        if(currChar == ']'){
            while(numOfTimes >0){
                ans += toAppend;
                numOfTimes --;
            }
        }

        if(unProcessed.length() > 0){
            ans += processString(unProcessed.charAt(0),unProcessed.substring(1),numOfTimes,toAppend);
        }

        return ans;
    }


    static String decodeUsingStack(String s){
        StringBuilder result = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)) {
                numStack.push(c - '0');
            }else{
                if(c != ']'){
                    strStack.push(Character.toString(c));
                }else{
                    int numOfTimes = numStack.pop();
                    StringBuilder poppedString = new StringBuilder();
                    while(!strStack.peek().equals("[")){
                        poppedString.append(strStack.pop());
                    }
                    strStack.pop();
                    poppedString = poppedString.reverse();
                    System.out.println(numOfTimes);
                    System.out.println(poppedString);
                    while(numOfTimes > 1){
                        poppedString.append(poppedString);
                        numOfTimes --;
                    }
                }
            }
        }
//        System.out.println(numStack);
        System.out.println(strStack);

        return result.toString();
    }
}

//3[a2[c]]