package DSASheet.Strings.Easy;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println("Repeated Substring Pattern");
    }

    public boolean repeatedSubstringPattern(String s) {
        String newTestS = s+s;
        newTestS = newTestS.substring(1,newTestS.length() - 1);
        return newTestS.contains(s);
    }
}
