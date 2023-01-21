package Assignments.Easy;

public class SplitTwoStringsToMakePalindrome {
    public static void main(String[] args) {
        System.out.println("Split Two Strings to Make Palindrome");
        System.out.println(checkPalindromeFormation("x","y"));
    }

    static boolean checkPalindromeFormation(String a, String b) {
        return check(a,b,a.length()) || check(b,a,a.length());
    }

    static boolean check(String a,String b,int n){
        int start = 0,end = n-1;
        while(start < end && a.charAt(start) == b.charAt(end)){
            start ++;
            end --;
        }
        return isPalindrome(a,start,end) || isPalindrome(b,start,end);
    }

    static boolean isPalindrome(String s,int start,int end){
        while(start < end && s.charAt(start) == s.charAt(end)){
            start ++;
            end --;
        }
        return start >= end;
    }


}
