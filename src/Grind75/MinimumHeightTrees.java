package Grind75;

import java.util.*;

public class MinimumHeightTrees {
    public static void main(String[] args) {
        System.out.println("Minimum Height Trees");

        int[][] intArray = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        System.out.println(findMinHeightTrees(6,intArray));
    }

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ansList = new ArrayList<>();
        if(n == 1) {
            ansList.add(0);
            return ansList;
        }

        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[n];

        for(int i = 0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }

        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < indegree.length;i++)
            if(indegree[i] == 1) queue.add(i);

        while(n > 2){
            int size = queue.size();
            n -= size;

            while(size > 0){
                for(int adjNode : graph.get(queue.remove())){
                    indegree[adjNode]--;
                    if(indegree[adjNode] == 1){
                        queue.add(adjNode);
                    }
                }
                size --;
            }
        }
        ansList.addAll(queue);
        return ansList;
    }
}
