package Assignments.Graphs;

import Assignments.Graphs.Disjoint.Disjoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalsAlgorithm {
    public static void main(String[] args) {
        System.out.println("Kruskal's Algorithm");
    }

    class Edge implements Comparable<Edge> {
        int src, dest, weight;
        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.weight = wt;
        }
        // Comparator function used for
        // sorting edgesbased on their weight
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    };

    public int spanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        List<Edge> edges = new ArrayList<Edge>();

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                int node = i;
                Edge temp = new Edge(i, adjNode, wt);
                edges.add(temp);
            }
        }

        Disjoint ds = new Disjoint(V);

        Collections.sort(edges);

        int mstWt = 0;
        for (int i = 0; i < edges.size(); i++) {
            int wt = edges.get(i).weight;
            int u = edges.get(i).src;
            int v = edges.get(i).dest;

            if (ds.findParent(u) != ds.findParent(v)) {
                mstWt += wt;
                ds.unionBySize(u, v);
            }
        }
        return mstWt;

    }
}
