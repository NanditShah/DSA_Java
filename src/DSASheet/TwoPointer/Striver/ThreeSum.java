package DSASheet.TwoPointer.Striver;

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

        for(int i = 0;i<nums.length - 2;i++){
            int target = -nums[i];
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int secondPartSum = nums[j] + nums[k];
                if(secondPartSum == target)
                    uniqTriplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                else if(secondPartSum < target) j++;
                else k--;
            }
        }

        ans.addAll(uniqTriplets);
        return ans;
    }
}
