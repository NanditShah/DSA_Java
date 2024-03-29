package Assignments.Easy;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring");
    }

    static String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int max_len = 1;
        int n = s.length();
        int st = 0, end = 0;

        // Odd length
        for(int i = 0; i < n-1; ++i){
            if(s.length() % 2 != 0){
                int l = i, r = i;
                while(l >= 0 && r < n){
                    if(s.charAt(l) == s.charAt(r)){
                        l--; r++;
                    }else
                        break;
                }
                int len = r-l-1;
                if(len > max_len){
                    max_len = len;
                    st = l+1;
                    end = r-1;
                }
            }else {
                //            For even length
                int l = i;
                int r = i + 1;
                while (l >= 0 && r < n) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l--;
                        r++;
                    } else
                        break;
                }
                int len = r - l - 1;
                if (len > max_len) {
                    max_len = len;
                    st = l + 1;
                    end = r - 1;
                }
            }
        }

        return s.substring(st, end + 1);
    }
}
