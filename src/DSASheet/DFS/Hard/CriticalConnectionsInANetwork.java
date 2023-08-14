package DSASheet.DFS.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnectionsInANetwork {
    public static void main(String[] args) {
        System.out.println("Critical Connections in a Network");
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (List<Integer> it : connections) {
            int u = it.get(0); int v = it.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] vis = new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        List<List<Integer>> bridges = new ArrayList<>();
        dfsForConnection(0, -1, vis, adj, tin, low, bridges);
        return bridges;
    }

    private int timer = 1;

    public void dfsForConnection(int node,int parent,int[] vis, ArrayList<ArrayList<Integer>> adj,int[] tin,int[] low,List<List<Integer>> bridges){
        vis[node] = 1;
        tin[node] = low[node] = timer;
        timer++;

        for(int adjNode : adj.get(node)){
            if(vis[node] == 0){
                dfsForConnection(adjNode,node,vis,adj,tin,low,bridges);
                low[node] = Math.min(low[node],low[adjNode]);

                if(low[node] < low[adjNode]) bridges.add(Arrays.asList(adjNode,node));
            }else{
                low[node] = Math.min(low[node],low[adjNode]);
            }
        }
    }
}
