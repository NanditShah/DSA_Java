package Blind75.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("3Sum");
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> uniqTriplets = new HashSet<>();

        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i < n - 2;i++){
            int j = i+1;
            int k = n - 1;
            while(j < k){
                if(nums[j] + nums[k] == -nums[i]) {
                    uniqTriplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k--;
                    j++;
                }else if(nums[j] + nums[k] < -nums[i]) j++;
                else k--;
            }
        }
        ans.addAll(uniqTriplets);
        return ans;
    }
}
