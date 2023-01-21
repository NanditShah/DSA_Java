package Assignments.Easy;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        System.out.println("Sort Array by Increasing Frequency");
    }

    static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hMap = new HashMap<Integer,Integer>();

        for(int num : nums){
            if(hMap.containsKey(num)){
                hMap.put(num,hMap.get(num)+1);
            }else{
                hMap.put(num,1);
            }
        }

        List<Integer> list = new ArrayList<Integer>(hMap.keySet());
        Collections.sort(list,(a,b) -> {
            if (hMap.get(a) == hMap.get(b)) {
                return b - a;
            } else {
                return hMap.get(a) - hMap.get(b);
            }
        });

        int[] ans = new int[nums.length];
        int index = 0;
        for(int num : list){
            for(int i = 0;i<hMap.get(num);i++){
                ans[index++] = num;
            }
        }
        return ans;
    }
}
