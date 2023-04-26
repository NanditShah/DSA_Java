package Assignments.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    public static void main(String[] args) {
        System.out.println("Dijkstra");
    }

    class Pair{
        int node;
        int distance;

        public Pair(int node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    public int[] dijkstra(int V, ArrayList<ArrayList<Pair>> adj,int S){
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);

        int[] dist = new int[V];
        for(int i = 0;i<V;i++){
            dist[i] = (int)(10e9);
        }

//        adding source node entry in distance array and priority queue
        dist[S] = 0;
        pq.add(new Pair(S,0));

        while(!pq.isEmpty()){
            Pair removedNode = pq.remove();
            int distance = removedNode.distance;
            int node = removedNode.node;

            for(int i = 0;i<adj.get(node).size();i++){
                int adjNode = adj.get(node).get(i).node;
                int adjNodeWeight  = adj.get(node).get(i).distance;

                if(distance + adjNodeWeight < dist[adjNode]){
                    dist[adjNode] = distance + adjNodeWeight;
                    pq.add(new Pair(adjNode,dist[adjNode]));
                }
            }
        }

        return dist;
    }
}
