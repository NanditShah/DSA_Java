package Grind75;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        System.out.println("Contiguous Array");
    }

    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        hMap.put(0,-1);

        int sum = 0;
        int maxLen = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) sum += -1;
            else sum += 1;

            if(hMap.containsKey(sum)){
                maxLen = Math.max(i - hMap.get(sum), maxLen);
            }else{
                hMap.put(sum,i);
            }
        }
        return maxLen;
    }
}
