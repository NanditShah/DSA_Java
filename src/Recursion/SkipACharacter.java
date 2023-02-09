package Recursion;

public class SkipACharacter {
    public static void main(String[] args) {
        System.out.println("Skip particular character from string");
        System.out.println(skipGivenCharacter('a',"123a456a789a0"));
    }

    static String skipGivenCharacter(char c,String s){
        if(s.length() == 0){
            return "";
        }
        String characterToAdd = s.charAt(0) == c ? "" : s.charAt(0)+"";
        return characterToAdd+skipGivenCharacter(c,s.substring(1));
    }
}
