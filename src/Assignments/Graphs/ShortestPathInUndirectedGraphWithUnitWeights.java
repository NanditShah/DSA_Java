package Assignments.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ShortestPathInUndirectedGraphWithUnitWeights {
    public static void main(String[] args) {
        System.out.println("Shortest Path in Undirected Graph with Unit Weights");
    }

    public int[] findShortestPath(int N,int M,int[][] egdes,int src){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i =0;i<N;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i =0;i<M;i++){
            int u = egdes[i][0];
            int v = egdes[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int[] dist = new int[N];
        for(int i = 0;i<N;i++){
            dist[i] = (int)(1e9);
        }

        dist[src] = 0;
        Queue<Integer> q= new LinkedList<>();
        q.add(src);

        while(!q.isEmpty()){
            int node = q.remove();
            for(int adjNode : adjList.get(node)){
                if(dist[node] + 1 < dist[adjNode]){
                    dist[adjNode] = dist[node] + 1;
                }
            }
        }

        for(int i = 0;i<N;i++){
            if(dist[i] == (int)(1e9)){
                dist[i] = -1;
            }
        }
        return dist;
    }

}
