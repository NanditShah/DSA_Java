package Assignments.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgorithm {
    public static void main(String[] args) {
        System.out.println("Bellman Ford Algorithm");

        int V = 6;
        int S = 0;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
            }
        };

        int[] dist = bellman_ford(V,edges,S);

        System.out.println(Arrays.toString(dist));
    }

    public static int[] bellman_ford(int V,ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) dist[i] = Integer.MAX_VALUE;
        dist[S] = 0;

        for(int i = 0;i<V - 1;i++){
            for(ArrayList<Integer> it : edges){
                int startNode = it.get(0);
                int endNode = it.get(1);
                int weight = it.get(2);

                if(dist[startNode] != Integer.MAX_VALUE && dist[startNode] + weight < dist[endNode]){
                    dist[endNode] = dist[startNode] + weight;
                }
            }
        }


//        Checking for negative cycle, if min distance still decrease even after V-1 then graph have negative cycle
        for(ArrayList<Integer> it : edges){
            int startNode = it.get(0);
            int endNode = it.get(1);
            int weight = it.get(2);

            if(weight != Integer.MAX_VALUE && dist[startNode] + weight < dist[endNode]){
                int[] temp = {-1};
                return temp;
            }
        }

        return dist;
    }
}
