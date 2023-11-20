package Blind75.Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int i = 0;i<nums.length;i++)
            hMap.put(target - nums[i],i);

        for(int i = 0;i<nums.length;i++)
            if(hMap.containsKey(nums[i]) && i != hMap.get(nums[i])) return new int[] {i,hMap.get(nums[i])};

        return new int[] {-1,-1};
    }
}
