package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        System.out.println("Combinations");
        List<List<Integer>> combinations = combine(1,1);
        System.out.println(combinations);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        dfs(combinations,new ArrayList<>(),1,n,k);
        return combinations;
    }

    public static void dfs(List<List<Integer>> combinations,List<Integer> path,int start,int n,int k){
        if(path.size() == k){
            combinations.add(new ArrayList<>(path));
            return;
        }

        for(int i = start;i<=n;i++){
            path.add(i);
            dfs(combinations,path,i+1,n,k);
            path.remove(path.size() - 1);
        }
    }
}
