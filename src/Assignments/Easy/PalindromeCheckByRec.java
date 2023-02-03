package Assignments.Easy;

public class PalindromeCheckByRec {
    public static void main(String[] args) {
        System.out.println("Palindrome string using recursion");
        String s = "1";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    static boolean isPalindrome(String s,int start,int end){
        if(start == end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        if(start < end+1){
            return isPalindrome(s,start+1,end-1);
        }
        return true;
    }
}
