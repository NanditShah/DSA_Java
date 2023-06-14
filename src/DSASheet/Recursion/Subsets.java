package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println("Subsets");
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        dfs(subsets,0,new ArrayList<>(),nums);
        return subsets;
    }

    public void dfs(List<List<Integer>> subsets,int start,ArrayList<Integer> path,int[] nums){
        subsets.add(new ArrayList<>(path));
        for(int i = start;i<nums.length;i++){
            path.add(nums[i]);
            dfs(subsets,i+1,path,nums);
            path.remove(path.size() - 1);
        }
    }

}
