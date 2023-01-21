package Assignments.Easy;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        System.out.println("Decrypt String from Alphabet to Integer Mapping\n");
    }

    static String freqAlphabets(String s) {
        String ans = "";

        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                ans += (char) (Integer.valueOf(s.substring(i, i + 2)) + 'a' - 1);
                i += 3;
            } else {
                ans += (char) ((s.charAt(i) - '0') + 'a' - 1);
                i += 1;
            }
        }

        return ans;
    }
}
