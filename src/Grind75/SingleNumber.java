package Grind75;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("Single Number");
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }

        return (int) set.toArray()[0];
    }
}
