package Assignments.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
        System.out.println("Find Unique Binary String");
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> binSet = new HashSet<>();

        for (String s : nums)
            binSet.add(s);

        return generateAndCheck("", n, binSet);
    }

    public String generateAndCheck(String curr, int n, Set<String> binSet) {
        if (curr.length() == n) {
            if (!binSet.contains(curr)) return curr;
            return "";
        }

        String addZero = generateAndCheck(curr + "0", n, binSet);
        if (!addZero.isEmpty()) return addZero;

        return generateAndCheck(curr + "1", n, binSet);
    }

}
