package Assignments.Easy;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Find the Difference of Two Arrays");
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i : nums1){
            s1.add(i);
        }
        for(int i : nums2){
            s2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i : nums1){
            if(!s2.contains(i)){
                if(!l1.contains(i)) l1.add(i);
            }
        }
        for(int i : nums2){
            if(!s1.contains(i)){
                if(!l2.contains(i)) l2.add(i);
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        res.add(l1);
        res.add(l2);

        return res;

    }
}
