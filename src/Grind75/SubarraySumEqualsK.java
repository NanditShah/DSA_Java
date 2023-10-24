package Grind75;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println("Subarray Sum Equals K");
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);

        int sum = 0;
        int count = 0;
        for(int num : nums){

            sum += num;
            int remainder = sum - k;

            count += hmap.getOrDefault(remainder,0);
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
