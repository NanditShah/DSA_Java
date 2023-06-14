package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println("Combination Sum III");
        List<List<Integer>> combinations = combinationSum3(4,1);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(combinations,new ArrayList<>(),1,n,k);
        return combinations;
    }

    public static void dfs(List<List<Integer>> combinations, ArrayList<Integer> path, int start, int target, int k) {
        if(target < 0) return;

        if(target == 0 && path.size() == k){
            combinations.add(new ArrayList<>(path));
            return;
        }

        for(int i = start;i<=9;i++){
            path.add(i);
            dfs(combinations,path,i+1,target - i,k);
            path.remove(path.size() - 1);
        }
    }

}
