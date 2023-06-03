package DSASheet.Arrays.Medium;

import java.util.HashMap;
import java.util.HashSet;

public class SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        System.out.println("Subarray Sums Divisible by K");
    }

    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        hMap.put(0,1);
        int ansCount = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
            int remainder = sum % k;
            if(remainder < 0) remainder += k;
            if(hMap.containsKey(remainder)){
                ansCount += hMap.get(remainder);
            }
            hMap.put(remainder,hMap.getOrDefault(remainder,0)+1);
        }
        return ansCount;
    }
}
