package Grind75;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println("Valid Palindrome");
        System.out.println(isPalindrome("0F"));
    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        s = s.trim();
        int start = 0,end = s.length() - 1;

        while(start < end){
            while(start < s.length() && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while(end > 0 && !Character.isLetterOrDigit(s.charAt(end))) end--;

            if(start < s.length() &&  end > 0 && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
            start++;
            end--;

        }
        return true;
    }
}
