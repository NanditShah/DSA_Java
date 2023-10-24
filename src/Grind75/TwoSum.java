package Grind75;


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(!hMap.isEmpty() && hMap.containsKey(complement)) return new int[] {i,hMap.get(complement)};
            hMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
