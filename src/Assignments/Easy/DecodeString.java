package Assignments.Easy;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println("Decode String");
        decodeString("3[a2[c]]");
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
}
