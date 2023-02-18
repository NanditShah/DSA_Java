package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        System.out.println("Combination Sum II");
        List<List<Integer>> ans = combinationSum2(new int[] {10,1,2,7,6,1,5},8);
        System.out.println(ans);
    }


    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        getUniqNumberCombinationSum(0,candidates,target,new ArrayList<Integer>(),ans);
        return ans;
    }

    static void getUniqNumberCombinationSum(int s,int [] candidates,int target,List<Integer> path,List<List<Integer>> ans){

        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = s;i<candidates.length;i++){
            if(i == s || candidates[i] != candidates[i-1]){
                path.add(candidates[i]);
                getUniqNumberCombinationSum(i+1, candidates, target - candidates[i], path, ans);
                path.remove(path.size() - 1);
            }
        }
    }
}
