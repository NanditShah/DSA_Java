package Assignments.Graphs;


import java.util.ArrayList;
import java.util.Stack;

// Kosaraju's Algorithm
public class StronglyConnectedComponents {
    public static void main(String[] args) {
        System.out.println("Strongly Connected Components");
    }

    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];

        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<V;i++){
            if(vis[i] == 0){
                dfs(i,vis,st,adj);
            }
        }

        ArrayList<ArrayList<Integer>> adjT = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adjT.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            vis[i] = 0;
            for (Integer it : adj.get(i)) {
                // i -> it
                // it -> i
                adjT.get(it).add(i);
            }
        }

        int sccCount = 0;

        while(!st.isEmpty()){
            int node = st.pop();
            if(vis[node] == 0){
                sccCount++;
                dfs2(node,vis,adjT);
            }
        }

        return sccCount;
    }

    private void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for(int adjNode : adj.get(node)){
            dfs(adjNode,vis,st,adj);
        }
        st.add(node);
    }

    private void dfs2(int node, int[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        for(int adjNode : adj.get(node)){
            if(adjNode == 0){
                dfs2(adjNode,vis,adj);
            }
        }
    }

}
