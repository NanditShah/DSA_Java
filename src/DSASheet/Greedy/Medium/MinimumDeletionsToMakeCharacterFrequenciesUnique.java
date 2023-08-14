package DSASheet.Greedy.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public static void main(String[] args) {
        System.out.println("Minimum Deletions to Make Character Frequencies Unique");
        System.out.println(minDeletions("aaabbbcc"));
    }

    public static int minDeletions(String s) {
        int[] freqArr = new int[27];
        for(char ch : s.toCharArray()) freqArr[ch - 'a']++;

        int deletion = 0;
        HashSet<Integer> freqCharSet = new HashSet<>();
        for(int count : freqArr){
            while(count != 0 && freqCharSet.contains(count)){
                deletion++;
                count --;
            }
            freqCharSet.add(count);
        }
        return deletion;
    }
}
