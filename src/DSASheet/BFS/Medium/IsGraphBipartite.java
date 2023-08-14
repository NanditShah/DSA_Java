package DSASheet.BFS.Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static void main(String[] args) {
        System.out.println("Is Graph Bipartite?");
        int[][] graph = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };
        System.out.println(isBipartite(graph));
    }

    public static boolean isBipartite(int[][] graph) {
        int[] set = new int[graph.length];
        for(int i = 0;i < graph.length;i++){
            if(set[i] == 0){
                if(!bfs(i,set,graph)) return false;
            }
        }
        return true;
    }

    public static boolean bfs(int node,int[] colors,int[][] graph){
        Queue<Integer> helperQueue = new LinkedList<>();
        helperQueue.add(node);
        colors[node] = 1;

        while(!helperQueue.isEmpty()){
            int topNode = helperQueue.remove();

            for(int adjNode : graph[topNode]){
                if(colors[adjNode] == colors[topNode]) return false;
                else if(colors[adjNode] == 0){
                    helperQueue.add(adjNode);
                    colors[adjNode] = colors[topNode] * -1;
                 }
            }
        }
        return true;
    }
}
