package Assignments.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        System.out.println("BSF of graphs");
    }

    public List<Integer> bfsOfGraph(int v,  ArrayList<ArrayList<Integer>> adj){

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> bfsQueue = new LinkedList<>();
        int[] visited = new int[v];

        bfsQueue.add(0);
        visited[0] = 1;

        while (!bfsQueue.isEmpty()){
            Integer vertex = bfsQueue.poll();
            ans.add(vertex);

            for(Integer vt : adj.get(vertex)){
                if(visited[vt] == 0){
                    visited[vt] = 1;
                    bfsQueue.add(vt);
                }
            }
        }

        return ans;
    }
}
