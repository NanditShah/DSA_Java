package Assignments.Graphs.Disjoint;

import java.util.ArrayList;
import java.util.List;

public class Disjoint {
    public List<Integer> rank = new ArrayList<>();
    public List<Integer> sizes = new ArrayList<>();

    public List<Integer> parents = new ArrayList<>();
    public Disjoint(int size) {
        for(int i = 0;i<=size;i++){
            rank.add(0);
            sizes.add(0);
            parents.add(i);
        }
    }


    public int findParent(int u){
        if(parents.get(u) == u){
            return u;
        }

        int ulp = findParent(parents.get(u));
        parents.set(u,ulp);
        return parents.get(u);
    }

    public void unionByRank(int u,int v){
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;

        int rankUlpU = rank.get(ulpU);
        int rankUlpV = rank.get(ulpV);

        if(rankUlpU < rankUlpV){
            parents.set(ulpU,ulpV);
        }else if(rankUlpV < rankUlpU){
            parents.set(ulpV,ulpU);
        }else{
            parents.set(ulpV,ulpU);
            rank.set(ulpU,rankUlpU+1);
        }
    }


    public void unionBySize(int u,int v){
        int ulpU = findParent(u);
        int ulpV = findParent(v);

        if(ulpU == ulpV) return;

        int sizeUlpU = sizes.get(ulpU);
        int sizeUlpV = sizes.get(ulpV);

        if(sizeUlpU < sizeUlpV){
            parents.set(ulpU,ulpV);
            sizes.set(ulpV,sizeUlpU+sizeUlpV);
        }
        else{
            parents.set(ulpV,ulpU);
            sizes.set(ulpU,sizeUlpU+sizeUlpV);
        }
    }
}

class Main{
    public static void main(String[] args) {
            Disjoint ds = new Disjoint(7);
            ds.unionByRank(1, 2);
            ds.unionByRank(2, 3);
            ds.unionByRank(4, 5);
            ds.unionByRank(6, 7);
            ds.unionByRank(5, 6);

            // if 3 and 7 same or not
            if (ds.findParent(3) == ds.findParent(7)) {
                System.out.println("Same");
            } else
                System.out.println("Not Same");

            ds.unionByRank(3, 7);
            if (ds.findParent(3) == ds.findParent(7)) {
                System.out.println("Same");
            } else
                System.out.println("Not Same");
    }
}
