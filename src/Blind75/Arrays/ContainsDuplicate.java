package Blind75.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains Duplicate");
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();
        for(int num : nums) {
            if(hSet.contains(num)) return true;
            hSet.add(num);
        }
        return false;
    }
}
