package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("Combination Sum");
        List<List<Integer>> combinations = combinationSum(new int[] {2},1);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(combinations,new ArrayList<>(),0,candidates,target);
        return combinations;
    }

    public static void dfs(List<List<Integer>> combinations,List<Integer> path,int start,int[] candidates,int target){

        if(target < 0) return;

        if(target == 0){
            combinations.add(new ArrayList<>(path));
            return;
        }

        for(int i = start;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(combinations,path,i,candidates,target - candidates[i]);
            path.remove(path.size() - 1);
        }
    }

}
