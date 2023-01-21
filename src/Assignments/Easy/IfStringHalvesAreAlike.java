package Assignments.Easy;

public class IfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println("Determine if String Halves Are Alike");
    }

    static boolean halvesAreAlike(String s) {
        int length = s.length();
        return vowelsCount(s.substring(0,length/2)) == vowelsCount(s.substring(length/2,length));
    }


    static int vowelsCount(String s){
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        for(char c:chars){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u'  ){
                count ++;
            }
        }
        return count;
    }
}
