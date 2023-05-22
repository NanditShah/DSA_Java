package DSASheet.Arrays.Medium;

import java.util.*;

public class ThreeSum {

//    Check in assignment folder as well
    public static void main(String[] args) {
        System.out.println("3Sum");
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i =0;i<nums.length ;i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        ans.addAll(s);
        return ans;
    }
}
