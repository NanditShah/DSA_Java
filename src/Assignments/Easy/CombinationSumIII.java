package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        System.out.println("Combination Sum III");
        List<List<Integer>> ans = combinationSum3(3,9);
        System.out.println(ans);
    }

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();

        findCombination(1,k,n,new ArrayList<>(),ans);

        return ans;
    }

    static void findCombination(int s,int k,int target,List<Integer> path,List<List<Integer>> ans){

        if(target < 0){
            return;
        }
        if(target == 0){
            if(k == path.size()){
                ans.add(new ArrayList<>(path));
            }
            return;
        }

        for(int i = s;i<=target;i++){
            path.add(i);
            findCombination(i+1,k,target - i,path,ans);
            path.remove(path.size() - 1);
        }
    }


}
