package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        System.out.println("Subsets");
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), ans);
        return ans;
}

    static void dfs(int[] nums, int s, List<Integer> path, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path));

        for (int i = s; i < nums.length; ++i) {
            path.add(nums[i]);
            dfs(nums, i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
