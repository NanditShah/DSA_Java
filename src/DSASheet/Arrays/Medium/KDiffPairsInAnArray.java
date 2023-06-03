package DSASheet.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        System.out.println("K-diff Pairs in an Array");
    }

    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        int pairCount = 0;
        if(k == 0){
            for(int freq : freqMap.values()){
                if(freq >= 2) pairCount++;
            }
        }else{
            for(int freq : freqMap.keySet()){
                if(freqMap.containsKey(k+freq)){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}
