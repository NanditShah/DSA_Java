package DSASheet.Strings.Medium;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring");
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if(s.length() <= 1) return s;

        int maxLen = 0;
        int startIndex = 0;
        int endIndex = 0;

        for(int i =0;i<s.length() - 1;i++){
            int start = i;
            int end = i;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            int length = end - start - 1;
            if(length > maxLen){
                maxLen = length;
                startIndex = start+1;
                endIndex = end - 1;
            }

            start = i;
            end = i+1;
            while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            length = end - start - 1;
            if(length > maxLen){
                maxLen = length;
                startIndex = start+1;
                endIndex = end-1;
            }
        }

        return s.substring(startIndex,endIndex+1);
    }
}
