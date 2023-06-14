package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        System.out.println("Combination Sum II");
        List<List<Integer>> combinations = combinationSum2(new int[] {10,1,2,7,6,1,5},8);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(combinations,new ArrayList<>(),0,candidates,target);
        return combinations;
    }

    public static void dfs(List<List<Integer>> combinations, ArrayList<Integer> path, int start, int[] candidates, int target) {
        if(target < 0) return;

        if(target == 0){
            combinations.add(new ArrayList<>(path));
            return;
        }

        for(int i = start;i<candidates.length;i++){
            if(i == start || candidates[i] != candidates[i - 1]){
                path.add(candidates[i]);
                dfs(combinations,path,i+1,candidates,target - candidates[i]);
                path.remove(path.size() - 1);
            }
        }
    }
}
