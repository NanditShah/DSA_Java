package DSASheet.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");

        int[] arr = {3,3};

        int[] ans = twoSum(arr,6);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(indexMap.containsKey(target - nums[i])){
                return new int[] {indexMap.get(target - nums[i]),i};
            }
            indexMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
