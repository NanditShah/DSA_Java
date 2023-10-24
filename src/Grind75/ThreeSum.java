package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("3Sum");
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        HashSet<List<Integer>> uniqTriplets = new HashSet<>();
        for(int i = 0;i < nums.length - 2;i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == -nums[i]) {
                    uniqTriplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                }else if(nums[j] + nums[k] < -nums[i]) j++;
                else k--;
            }
        }
        ansList.addAll(uniqTriplets);
        return ansList;
    }
}
