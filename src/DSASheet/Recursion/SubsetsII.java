package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        System.out.println("Subsets II");
        List<List<Integer>> subsets = subsetsWithDup(new int[] {1,2,2});
        System.out.println(subsets);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        dfs(subsets, new ArrayList<>(),0,nums);
        return subsets;
    }

    public static void dfs(List<List<Integer>> subsets,List<Integer> path,int start,int[] nums){
        subsets.add(new ArrayList<>(path));
        for(int i = start;i<nums.length;i++){
            if(i > start && nums[i - 1] == nums[i]) continue;
            path.add(nums[i]);
            dfs(subsets,path,i+1,nums);
            path.remove(path.size() - 1);
        }
    }
}
