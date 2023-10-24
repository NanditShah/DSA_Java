package Grind75;

import java.util.HashMap;
import java.util.List;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println("Number of Good Pairs");
    }

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int result = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            result += count.get(num) - 1;
        }

        return result;
    }
}
