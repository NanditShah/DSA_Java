package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println("Permutations");
        List<List<Integer>> ans = permute(new int[] {1});
        System.out.println(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();

        boolean[] visited = new boolean[nums.length];
        dfs(0,new ArrayList<>(),permutations,visited,nums);
        return permutations;
    }

    public static void dfs(int start,List<Integer> path,List<List<Integer>> permutations,boolean[] visited,int[] nums){
        if(nums.length == path.size()){
            permutations.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                path.add(nums[i]);
                visited[i] = true;
                dfs(i+1,path,permutations,visited,nums);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }


}
