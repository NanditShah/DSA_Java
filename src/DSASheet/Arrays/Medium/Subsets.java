package DSASheet.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println("Subsets");
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), paths);
        return paths;
    }

    static void dfs(int[] nums, int start, List<Integer> path, List<List<Integer>> paths) {
        paths.add(new ArrayList<>(path));
        for(int i = start;i<nums.length;++i){
            path.add(nums[i]);
            dfs(nums,i+1,path,paths);
            path.remove(path.size() - 1);
        }
    }
}
