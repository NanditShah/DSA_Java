package Assignments.Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathInDAG {
    public static void main(String[] args) {
        System.out.println("Shortest Path in Directed Acyclic Graph");
    }

    class Pair{
        int adjNode;
        int weight;

        public Pair(int adjNode,int weight){
            this.adjNode = adjNode;
            this.weight = weight;
        }
    }


    public int[] findShortestPath(int N,int M,int[][] egdes){
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();

        for(int i =0;i<N;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i =0;i<M;i++){
            int u = egdes[i][0];
            int v = egdes[i][1];
            int weight = egdes[i][2];
            adjList.get(u).add(new Pair(v,weight));
        }

        int[] visited = new int[N];
        Stack<Integer> topoStack = new Stack<>();

        for(int i = 0;i<N;i++){
            if(visited[i] != 1){
                topoSort(adjList,topoStack,visited,i);
            }
        }

        int[] dist = new int[N];
        for(int i = 0;i<N;i++){
            dist[i] = (int)(1e9);
        }

        dist[0] = 0;

        while(!topoStack.isEmpty()){
            int node = topoStack.pop();

            for(int i = 0;i<adjList.get(node).size();i++){
                int adjN = adjList.get(node).get(i).adjNode;
                int weight = adjList.get(node).get(i).weight;

                if(dist[node]+weight < dist[adjN]){
                    dist[adjN] = dist[node]+weight;
                }
            }
        }
        return dist;
    }

    private void topoSort(ArrayList<ArrayList<Pair>> adjList, Stack<Integer> topoStack, int[] visited,int node) {
        visited[node] = 1;

        for(int i = 0;i<adjList.get(node).size();i++){
            int adjN = adjList.get(node).get(i).adjNode;
            if(visited[adjN] == 0){
                topoSort(adjList,topoStack,visited,adjN);
            }
        }
        topoStack.push(node);
    }


}
