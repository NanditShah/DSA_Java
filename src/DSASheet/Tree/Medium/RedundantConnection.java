package DSASheet.Tree.Medium;

import java.util.Arrays;

public class RedundantConnection {
    public static void main(String[] args) {
        System.out.println("Redundant Connection");
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parents = new int[n+1];
        int[] ranks = new int[n+1];
        Arrays.fill(ranks,1);
        for(int i =0;i<n;i++) parents[i] = i;
        for(int[] edge : edges){
            if(!union(edge,parents,ranks)) return edge;
        }
        return new int[] {-1,-1};
    }

    public int findParent(int n,int[] parents){
        int p = parents[n];
        while(p != parents[p]){
            parents[p] = parents[parents[p]];
            p = parents[p];
        }
        return p;
    }

    public boolean union(int[] edge,int[] parents, int[] ranks){
        int n1 = findParent(edge[0],parents);
        int n2 = findParent(edge[0],parents);

        if(n1 == n2) return false;
        if(ranks[n1] > ranks[n2]){
            parents[n2] = n1;
            ranks[n1] += ranks[n2];
        }else{
            parents[n1] = n2;
            ranks[n2] += ranks[n1];
        }
        return true;
    }
}
