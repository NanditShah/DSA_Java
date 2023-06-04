package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        System.out.println("Permutations II");

        System.out.println("Permutations");
        List<List<Integer>> ans = permuteUnique(new int[] {1,1,2});
        System.out.println(ans);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        Arrays.sort(nums);
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
            if(visited[i]) continue;
            if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            path.add(nums[i]);
            visited[i] = true;
            dfs(i+1,path,permutations,visited,nums);
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }

}
