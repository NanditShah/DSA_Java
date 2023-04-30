package Assignments.Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PrintShortestPath {
    public static void main(String[] args) {
        System.out.println("Print Shortest Path");
    }

    class Pair{
        int adjNode;
        int weight;

        public Pair(int adjNode,int weight){
            this.adjNode = adjNode;
            this.weight = weight;
        }
}
    public List<Integer> shortestPath(int n, int m, int edges[][]) {

        List<List<Pair>> ajdList = new ArrayList<>();

        for(int i = 0;i<n;i++){
            ajdList.add(new ArrayList<>());
        }

        for(int i = 0;i<m;i++){
            ajdList.get(i).add(new Pair(edges[i][1],edges[i][2]));
            ajdList.get(i).add(new Pair(edges[i][0],edges[i][0]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.weight - y.weight);

        int[] dist = new int[n+1];
        int[] memoizedPathParent = new int[n+1];

        for(int i = 1;i<=n;i++) {
            dist[i] = (int)(1e9);
            memoizedPathParent[i] = i;
        }

        dist[1] = 0;

        while(!pq.isEmpty()){
            Pair removedPair = pq.remove();

            int node = removedPair.adjNode;
            int distance = removedPair.weight;

            for(Pair ajdPair : ajdList.get(node)){
                int adjNode = ajdPair.adjNode;
                int edW = ajdPair.weight;

                if(distance + edW < dist[adjNode]) {
                    dist[adjNode] = distance + edW;
                    pq.add(new Pair(distance + edW, adjNode));

                    memoizedPathParent[adjNode] = node;
                }
            }
        }

        List<Integer> path = new ArrayList<>();

        if(dist[n] == 1e9) {
            path.add(-1);
            return path;
        }

        int node = n;
        while(memoizedPathParent[node] != node) {
            path.add(node);
            node = memoizedPathParent[node];
        }
        path.add(1);

        Collections.reverse(path);
        return path;


    }

}
