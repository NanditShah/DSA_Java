package Assignments.Graphs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    public static void main(String[] args) {
        System.out.println("Number of Provinces");
    }

    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<v;i++){
            adj.add(new ArrayList<>());
        }

        for(int i =0;i<v;i++){
            for(int j = 0;j<v;j++){
                if(i!=j && isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }
        int[] visited = new int[v];
        int provinces = 0;
        for(int i = 0;i<v;i++){
            if(visited[i] == 0){
                provinces++;
                dfs(i,adj,visited);
            }
        }

        return provinces;

    }


    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited){
        visited[node] = 1;
        for(Integer vt : adj.get(node)){
            if(visited[vt] == 0){
                dfs(vt,adj,visited);
            }
        }
    }

}
