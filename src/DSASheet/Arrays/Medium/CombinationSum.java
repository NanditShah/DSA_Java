package DSASheet.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println("Combination Sum");
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0,path,ans,target,candidates);
        return ans;
    }

    private void dfs(int startElement,List<Integer> path,List<List<Integer>> ans,int target,int[] candidates){
        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i =startElement;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(i,path,ans,target - candidates[i],candidates);
            path.remove(path.size() - 1);
        }
    }
}
