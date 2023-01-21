package Assignments.Easy;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd", word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
        System.out.println("Merge Strings Alternately");
    }

    static String mergeAlternately(String word1, String word2) {
        int smallestLength = word1.length() > word2.length() ? word2.length() : word1.length();
        String ans = "";
        for(int i = 0;i<smallestLength;i++){
            System.out.println(i);
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }
        ans += word1.length() == smallestLength ? word2.substring(smallestLength) : word1.substring(smallestLength);
        return ans;
    }
}
