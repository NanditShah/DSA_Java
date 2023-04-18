package Assignments.Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectACycleInAnUndirectedGraph {
    public static void main(String[] args) {
        System.out.println("Detect a Cycle in an Undirected Graph");
    }

    class Pair{
        int node;
        int parent;

        public Pair(int node,int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean checkCycle(int v,List<List<Integer>> adj){
        int[] visited = new int[v];

        for(int i = 0;i<v;i++){
            if(visited[i] == 0){
//                For BFS
//                if(checkUsingBFS(v,i,visited,adj)) return true;
                
//                For DFS
//                if(checkUsingDFS(i,-1,visited,adj)) return true;
            }
        }
        return false;
    }

    private boolean checkUsingDFS(int node, int parent, int[] visited, List<List<Integer>> adj) {
        visited[node] = 1;

        for(int adjNode : adj.get(node)){
            if(visited[adjNode] == 0){
                if(checkUsingBFS(adjNode,node,visited,adj)) return true;
            }else if(parent == adjNode) return true;
        }
        return false;
    }

    private boolean checkUsingBFS(int v,int src, int[] visited, List<List<Integer>> adj) {
        Queue<Pair> bfsQueue = new LinkedList<>();
        visited[src] = 1;

        bfsQueue.add(new Pair(src,-1));

        while(!bfsQueue.isEmpty()){
            Pair removedNode = bfsQueue.remove();
            int parent = removedNode.parent;
            int node = removedNode.node;

            for(int adjNode : adj.get(node)){
                if(visited[adjNode] == 0){
                    visited[adjNode] = 1;
                    bfsQueue.add(new Pair(adjNode,node));
                }else if(parent != adjNode){
                    return true;
                }
            }
        }
        return false;
    }
}
