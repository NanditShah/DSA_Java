package Grind75;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains Duplicate");
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> distinctHashset = new HashSet<>();

        for(int num : nums){
            if(!distinctHashset.contains(num)){
                distinctHashset.add(num);
                continue;
            }
            return true;
        }
        return false;
    }
}
