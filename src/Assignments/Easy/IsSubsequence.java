package Assignments.Easy;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println("Is Subsequence");
    }

    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;
        if(s.isEmpty() || t.isEmpty()) return s.isEmpty();

        int i = 0;
        for(char ch : t.toCharArray()){
            int sCh = s.charAt(i);

            if(ch == sCh) i++;
            if(i == s.length()) break;
        }
        return i == s.length();
    }
}
