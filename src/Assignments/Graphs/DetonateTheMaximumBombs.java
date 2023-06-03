package Assignments.Graphs;

import java.util.ArrayList;
import java.util.List;

public class DetonateTheMaximumBombs {
    public static void main(String[] args) {
        System.out.println("Detonate the Maximum Bombs");
    }

    public int maximumDetonation(int[][] bombs) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0;i<bombs.length;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<bombs.length;i++){
            for(int j = 1;j<bombs.length;j++){
                int x1,x2,y1,y2,r1,r2;
                x1 = bombs[i][0];
                y1 = bombs[i][1];
                r1 = bombs[i][2];

                x2 = bombs[j][0];
                y2 = bombs[j][1];
                r2 = bombs[j][2];

                double d = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

                if(d <= r1) adjList.get(i).add(j);
                if(d <= r2) adjList.get(j).add(i);
            }
        }

        int maxDetonatedBombs = 0;
        for(int i = 0;i<bombs.length;i++){
            boolean[] visited = new boolean[bombs.length];
            maxDetonatedBombs = Math.max(maxDetonatedBombs,dfs(i,visited,adjList));
        }
        return maxDetonatedBombs;
    }

    private int dfs(int key,boolean[] visited,List<List<Integer>> adjList){
        if(visited[key]){
            return 0;
        }

        visited[key] = true;

        for(int neighbour : adjList.get(key)){
            dfs(neighbour,visited,adjList);
        }
        return trueCount(visited);
    }

    private int trueCount(boolean[] arr){
        int length = 0;
        for(boolean element : arr){
            if(element) length++;
        }
        return length;
    }
}
