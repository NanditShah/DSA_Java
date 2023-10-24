package Grind75;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        System.out.println("Find All Anagrams in a String");
    }

    public List<Integer> findAnagrams(String s1, String s2) {
        int s = s1.length(), p = s2.length();
        if(s < p)
            return new ArrayList<>();

        List<Integer> li = new ArrayList<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for(int i=0; i<p; i++) {
            c2[s2.charAt(i) - 'a']++;
            c1[s1.charAt(i) - 'a']++;
        }
        if(areEqual(c1, c2))
            li.add(0);

        for(int i=p; i<s; i++) {
            c1[s1.charAt(i-p) - 'a']--;
            c1[s1.charAt(i) - 'a']++;
            if(areEqual(c1, c2))
                li.add(i-p+1);
        }

        return li;
    }

    private boolean areEqual(int[] a, int[] b) {
        for(int i=0; i<26; i++)
            if(a[i] != b[i])
                return false;
        return true;
    }
}
