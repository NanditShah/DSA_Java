package Assignments.Graphs;

import java.util.ArrayList;

public class DetectCycleInADirectedGraph {
    public static void main(String[] args) {
        System.out.println("Detect cycle in a directed graph");
    }

    public boolean isCyclic(int v,ArrayList<ArrayList<Integer>> adjList){

        int[] visited = new int[v];
        int[] pathVisited = new int[v];

        for(int i = 0;i<v;i++){
            if(visited[i] == 0){
                if(checkUsingDFS(i,visited,pathVisited,v,adjList)){
                    return true;
                }
            }

        }
        return false;
    }

    public boolean checkUsingDFS(int node,int[] visited,int[] pathVisited, int v,ArrayList<ArrayList<Integer>> adjList){
        visited[node] = 1;
        pathVisited[node] = 1;


        for(int adjNode : adjList.get(node)){
            if(visited[adjNode] == 0){
                if(checkUsingDFS(adjNode,visited,pathVisited,v,adjList)){
                    return true;
                }
            }else if(pathVisited[adjNode] == 1){
                return true;
            }

        }
        pathVisited[node] = 0;
        return false;
    }
}
