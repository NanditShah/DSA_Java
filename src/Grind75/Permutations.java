package Grind75;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Permutations");
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums,visited,new ArrayList<>(),permutations);
        return permutations;
    }

    public void dfs(int[] nums,boolean[] visited,List<Integer> path,List<List<Integer>> combinations){
        if(path.size() == nums.length){
            combinations.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(!visited[i]){
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums,visited,path,combinations);
                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
