package Grind75;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        System.out.println("Subsets");
        int[] nums = {1,2,3};
        subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        getSubsetsUsingDFS(nums,0,new ArrayList<>(),subsets);

        System.out.println(subsets);
        return subsets;
    }

    public static void getSubsetsUsingDFS(int[] nums,int start,List<Integer> path,List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(path));
        for(int i = start;i<nums.length;i++){
            path.add(nums[i]);
            getSubsetsUsingDFS(nums,i+1,path,subsets);
            path.remove(path.size() - 1);
        }
    }
}
