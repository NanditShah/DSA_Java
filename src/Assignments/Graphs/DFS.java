package Assignments.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {
    public static void main(String[] args) {
        System.out.println("Depth-First Search");
    }

    public List<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> ans = new ArrayList<>();
        int[] visited = new int[v+1];

        dfs(0,adj,ans,visited);

        return ans;
    }

    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,List<Integer> ans,int[] visited){
        visited[node] = 1;
        ans.add(0);


        for(Integer vt : adj.get(node)){
            if(visited[vt] == 0){
                dfs(vt,adj,ans,visited);
            }
        }
    }

}
