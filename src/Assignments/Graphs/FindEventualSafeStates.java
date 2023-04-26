package Assignments.Graphs;

import java.util.*;

public class FindEventualSafeStates {
    public static void main(String[] args) {
        System.out.println("Find Eventual Safe States");
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v = graph.length;

        int[] visited = new int[v];
        int[] pathVisited = new int[v];
        int[] check = new int[v];

        for(int i = 0;i<v;i++){
            if(visited[i] == 0){
                checkUsingDFS(i,visited,pathVisited,check,v,graph);
            }

        }
        List<Integer> ansList = new ArrayList<>();

        for(int node : check){
            if(node == 1) {
                ansList.add(node);
            }
        }

        return ansList;
    }

    public boolean checkUsingDFS(int node,int[] visited,int[] pathVisited,int[] check ,int v,int[][] graph){
        visited[node] = 1;
        pathVisited[node] = 1;
        check[node] = 0;

        for(int adjNode : graph[node]){
            if(visited[adjNode] == 0){
                if(checkUsingDFS(adjNode,visited,pathVisited,check,v,graph)){
                    return true;
                }
            }else if(pathVisited[adjNode] == 1){
                return true;
            }

        }
        check[node] = 1;
        pathVisited[node] = 0;
        return false;
    }


//    Using topological sort
//    1.Reverse nodes connections
//    2.Start from indegree 0 and then start using topological sort
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        List<List<Integer>> adjRev = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjRev.add(new ArrayList<>());
        }
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            // i -> it
            // it -> i
            for (int it : adj.get(i)) {
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.remove();

            safeNodes.add(node);
            for (int it : adjRev.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }

//        Sorting the safeNodes as per the problem requirement
        Collections.sort(safeNodes);
        return safeNodes;
    }
}
