package Assignments.Easy;

import java.util.*;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        System.out.println("Repeated DNA Sequences");
        List<String> ans = findRepeatedDnaSequences("AAAAAAAAAA");
        System.out.println(Arrays.toString(ans.toArray()));
    }

    static List<String> findRepeatedDnaSequences(String s) {
        Set<String> ans = new HashSet<>();
        Set<String> seen = new HashSet<>();

        for (int i = 0; i + 10 <= s.length(); ++i) {
            final String seq = s.substring(i, i + 10);
            if (seen.contains(seq))
                ans.add(seq);
            seen.add(seq);
        }

        return new ArrayList<>(ans);
    }
}
