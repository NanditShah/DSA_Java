package DSASheet.TwoPointer.Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println("4Sum");
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums,4,target,0,nums.length);
    }

    public List<List<Integer>> kSum(int[] nums,int k,int target,int start,int n){
        if(k == 2){
            List<List<Integer>> res = new ArrayList<>();
            int i = start,j = n - 1;
            while(i < j){
                if(nums[i] == target - nums[j]){
                    List<Integer> combination = new ArrayList<>();
                    combination.add(nums[i]);
                    combination.add(nums[j]);
                    res.add(combination);
                    i++;
                    j--;
                    while(i < j && nums[i] == nums[i-1]) i++;
                    while(i < j && nums[j] == nums[j+1]) j--;
                }else if(nums[i] < target - nums[j]){
                    i++;
                }else{
                    j--;
                }
            }
            return res;
        }else{
            List<List<Integer>> res = new ArrayList<>();
            if(nums[0] > target/k || nums[n-1] < target/k) return res;
            for(int i = start;i<=n - k;i++){
                if(i == start || nums[i] != nums[i - 1]){
                    List<List<Integer>> rest = kSum(nums,k - 1,target - nums[i],i+1,n);
                    for(List<Integer> list : rest){
                        list.add(nums[i]);
                        res.add(list);
                    }
                }
            }
            return res;
        }
    }
}
