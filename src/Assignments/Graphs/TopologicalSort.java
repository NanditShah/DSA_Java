package Assignments.Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        System.out.println("Topological Sort");
    }

    public int[] topologicalSort(int v, ArrayList<ArrayList<Integer>> adjList){
        int[] visited = new int[v];
        Stack<Integer> stk = new Stack<>();

        for(int i =0;i<v;i++){
            if(visited[i] == 0){
                dfs(i,stk,visited,adjList);
            }
        }

        int[] ans = new int[v];
        int i = 0;
        while(!stk.isEmpty()){
            ans[i++] = stk.pop();
        }
        return ans;

    }

    private void dfs(int node, Stack<Integer> stk, int[] visited, ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = 1;
        for(int adjNode : adjList.get(node)){
            if(visited[adjNode] == 0){
                dfs(adjNode,stk,visited,adjList);
            }
        }
        stk.push(node);
    }
}
