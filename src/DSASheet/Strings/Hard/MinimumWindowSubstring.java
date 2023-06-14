package DSASheet.Strings.Hard;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(" Minimum Window Substring");

        String minWindowSubStr = minWindow("ADOBECODEBANC","ABC");
        System.out.println(minWindowSubStr);
    }

    public static String minWindow(String s, String t) {
        int [] map = new int [128];
        char [] chs = s.toCharArray();
        for(char c : t.toCharArray()){
            map[c]++;
        }

        int count = t.length(), slow = 0, fast = 0, head = 0, len = Integer.MAX_VALUE;

        while(fast < chs.length){
            if(map[chs[fast++]]-- > 0) count--;
            while(count == 0){
                if(fast - slow < len) {
                    len = fast - slow;
                    head = slow;
                }
                if(map[chs[slow++]]++ == 0) count++;
            }
        }

        return len == Integer.MAX_VALUE ? "": s.substring(head, head + len);
    }
}
