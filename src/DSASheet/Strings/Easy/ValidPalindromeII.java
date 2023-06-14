package DSASheet.Strings.Easy;

public class ValidPalindromeII {
    public static void main(String[] args) {
        System.out.println("Valid Palindrome II");

        boolean ans = validPalindrome("abca");
        System.out.println(ans);
    }

    public static boolean validPalindrome(String s) {
        for(int l = 0, r = s.length() - 1;l < r;l++,r--){
            if(s.charAt(l) != s.charAt(r)){
                return validPalindrome(l+1,r,s) || validPalindrome(l,r-1,s);
            }
        }
        return true;
    }

    public static boolean validPalindrome(int startIndex,int endIndex,String s){
        while(startIndex < endIndex){
            if(s.charAt(startIndex) != s.charAt(endIndex)) return false;
            startIndex ++;
            endIndex --;
        }
        return true;
    }
}
