package DSASheet.TwoPointer.Hard;

import java.util.HashMap;

public class SubarraysWithKDifferentIntegers {
    public static void main(String[] args) {
        System.out.println("Subarrays with K Different Integers");
        System.out.println(subarraysWithKDistinct(new int[] {1,2,1,2,3},2));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atmostKDistinctElement(nums,k) - atmostKDistinctElement(nums,k-1);
    }

    public static int atmostKDistinctElement(int[] nums,int k){
        int i = 0;
        int j = 0;
        int count = 0;
        HashMap<Integer,Integer> hMap = new HashMap<>();

        while(j < nums.length){
            hMap.put(nums[j],hMap.getOrDefault(nums[j],0)+1);

            while(hMap.size() > k){
                int currentVal = hMap.get(nums[i]);
                currentVal --;
                if(currentVal == 0) hMap.remove(nums[i]);
                else hMap.put(nums[i],currentVal);
                i++;
            }
            count += (j - i + 1);
            j++;
        }
        return count;
    }
}
