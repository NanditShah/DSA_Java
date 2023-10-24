package Grind75;

import java.util.HashSet;
import java.util.PriorityQueue;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("Longest Consecutive Sequence");
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();

        for(int num : nums) hset.add(num);

        int maxLen = 0;

        for(int num : nums){
            if(!hset.contains(num - 1)){
                int length = 1;
                while(hset.contains(length + num)){
                    length+=1;
                }
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}
