package Grind75;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("Combination Sum");
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(candidates,0,target,combinations,new ArrayList<>());
        return combinations;
    }

    public void dfs(int[] candidates,int start,int target,List<List<Integer>> combinations,List<Integer> path){
        if(target < 0) return;
        if(target == 0) combinations.add(new ArrayList<>(path));

        for(int i = start;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(candidates,i,target - candidates[i],combinations,path);
            path.remove(path.size() - 1);
        }
    }
}
