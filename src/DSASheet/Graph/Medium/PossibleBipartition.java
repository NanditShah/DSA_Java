package DSASheet.Graph.Medium;

import java.util.*;

public class PossibleBipartition {
    public static void main(String[] args) {
        System.out.println("Possible Bipartition");
    }

    HashMap<Integer, List<Integer>> graph = new HashMap<>();
    public boolean possibleBipartition(int n, int[][] dislikes) {
        if(dislikes.length == 0) return true;

        for(int[] dislike : dislikes){
            int hater = dislike[0];
            int hatee = dislike[1];

            graph.putIfAbsent(hater,new ArrayList<>());
            graph.putIfAbsent(hatee,new ArrayList<>());

            graph.get(hater).add(hatee);
            graph.get(hatee).add(hater);
        }

        int[] colors = new int[n+1];
        for(int i = 0;i < graph.size();i++){
            if(colors[i] == 0){
                if(!bfs(i,colors)) return false;
            }
        }

        return true;
    }

    public boolean bfs(int node,int[] colors){
        Queue<Integer> helperQueue = new LinkedList<>();
        helperQueue.add(node);
        colors[node] = 1;

        while(!helperQueue.isEmpty()){
            int topNode = helperQueue.remove();

            if(!graph.containsKey(topNode)) continue;
            for(int adjNode : graph.get(topNode)){
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
