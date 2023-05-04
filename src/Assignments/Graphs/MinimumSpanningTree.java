package Assignments.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumSpanningTree {
    public static void main(String[] args) {
        System.out.println("Minimum Spanning Tree");
    }

    class Pair {
        int node;
        int distance;
        public Pair(int distance, int node) {
            this.node = node;
            this.distance = distance;
        }
    }

    public int spanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj) {

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<Pair>((a,b) -> a.distance - b.distance);
        int[] visited = new int[V];
        int sum = 0;

        priorityQueue.add(new Pair(0,0));

        while(!priorityQueue.isEmpty()){
            Pair removedPair = priorityQueue.remove();

            int removedNode = removedPair.node;
            int removedDistance = removedPair.distance;

            if(visited[removedNode] == 1) continue;

            visited[removedNode] = 1;
            sum += removedDistance;

            for (int i = 0; i < adj.get(removedNode).size(); i++) {
                int edW = adj.get(removedNode).get(i).get(1);
                int adjNode = adj.get(removedNode).get(i).get(0);
                if (visited[adjNode] == 0) {
                    priorityQueue.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }
}
