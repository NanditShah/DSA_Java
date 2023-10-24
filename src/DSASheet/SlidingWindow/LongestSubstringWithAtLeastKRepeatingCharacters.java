package DSASheet.SlidingWindow;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println("Longest Substring with At Least K Repeating Characters");
    }

    public int longestSubstring(String s, int k) {
        if(s.length() == 1 && k == 1) return s.length();
        char[] charArr = s.toCharArray();
        return helper(charArr,0,s.length(),k);
    }

    public int helper(char[] charArr,int start,int end,int k){
        if(end - start < k) return 0;

        int[] count = new int[26];
        for(int i =start;i<end;i++) count[charArr[i] - 'a']++;

        for(int i = start;i<end;i++){
            if(count[charArr[i] - 'a'] < k){
                int  j = i+1;
                while(j < end && count[charArr[j] - 'a'] < k) j++;
                return Math.max(helper(charArr,start,i,k),helper(charArr,j,end,k));
            }
        }
        return end - start;
    }
}
