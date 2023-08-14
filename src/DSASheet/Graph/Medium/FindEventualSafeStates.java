package DSASheet.Graph.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindEventualSafeStates {
    public static void main(String[] args) {
        System.out.println("Find Eventual Safe States");
    }

    int v = 0;
    HashMap<Integer,Boolean> safe = new HashMap<>();
    public List<Integer> eventualSafeNodes(int[][] graph) {
        v = graph.length;
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0;i<v;i++){
            if(dfs(i,graph)) ansList.add(i);
        }
        return ansList;
    }

    public boolean dfs(int node,int[][] graph){
        if(safe.containsKey(node)) return safe.get(node);

        safe.put(node,false);
        for(int adjNode : graph[node])
            if(!dfs(adjNode,graph)) return false;

        safe.put(node,true);
        return true;
    }
}
