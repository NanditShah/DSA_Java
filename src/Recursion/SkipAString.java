package Recursion;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println("Skip a String");
        System.out.println(skipGivenString("abc","123abc456abc789abc0bc"));
    }

    static String skipGivenString(String skipMe,String s){
        if(s.length() == 0){
            return "";
        }
        if(s.startsWith(skipMe)){
            return skipGivenString(skipMe,s.substring(skipMe.length()));
        }else{
            return s.charAt(0)+skipGivenString(skipMe,s.substring(1));
        }
    }

}
