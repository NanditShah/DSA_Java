package Assignments.Easy;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        System.out.println("Maximum Repeating Substring");
        int ans = maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba");
        System.out.println(ans);
    }

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        String pat = word;
        while (sequence.contains(pat)) {
            count++;
            pat += word;
        }
        return count;
    }
}
