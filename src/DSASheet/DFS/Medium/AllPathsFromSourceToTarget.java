package DSASheet.DFS.Medium;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        System.out.println("All Paths From Source to Target");
        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> allPaths = allPathsSourceTarget(graph);
        System.out.println(allPaths);
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,allPaths,path,graph.length - 1,0);
        return allPaths;
    }

    private static void dfs(int[][] graph,List<List<Integer>> allPaths,List<Integer> path,int target,int currNode){
        if(currNode == target) {
            allPaths.add(new ArrayList<>(path));
            return;
        }
        for(int adjNode : graph[currNode]){
            path.add(adjNode);
            dfs(graph,allPaths,path,target,adjNode);
            path.remove(path.size() - 1);
        }
    }


}
