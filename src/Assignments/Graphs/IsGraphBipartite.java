package Assignments.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static void main(String[] args) {
        System.out.println("Is Graph Bipartite?");
    }

    public boolean isBipartite(int[][] graph) {
        int m = graph.length;
        int[] color = new int[m];

        for(int i =0;i<m;i++) color[i] = -1;

        for(int i = 0;i<m;i++){
            if(color[i] == -1){
//                For BFS
//                if(!checkUsingBFS(i,graph,color)){
//                    return false;
//                }

//                For DFS
                if(!checkUsingDFS(i,0,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkUsingBFS(int start, int[][] graph, int[] color) {
        int m = graph.length;

        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(start);
        color[start] = 0;

        while(!bfsQueue.isEmpty()){
            int node = bfsQueue.remove();

            for(int adjNode : graph[node]){
                if(color[adjNode] == -1){
                    color[adjNode] = 1 - color[node];
                    bfsQueue.add(adjNode);
                }else if(color[adjNode] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }


    private boolean checkUsingDFS(int start,int startColor, int[][] graph, int[] color) {

        color[start] = startColor;
            for(int adjNode : graph[start]){
                if(color[adjNode] == -1){
                    if(!checkUsingDFS(adjNode,1-startColor,graph,color)){
                        return false;
                    }
                }else if(color[adjNode] == color[start]){
                    return false;
                }
            }

        return true;
    }


}
