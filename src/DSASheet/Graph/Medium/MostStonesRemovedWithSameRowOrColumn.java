package DSASheet.Graph.Medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MostStonesRemovedWithSameRowOrColumn {
    public static void main(String[] args) {
        System.out.println("Most Stones Removed with Same Row or Column");
    }

    List<Integer>[] graph;
    Set<Integer> visited;
    public int removeStones(int[][] stones) {
        int numOfIslands = 0;
        int n = stones.length;
        graph = new List[n];
        visited = new HashSet<>();

        for(int i =0;i<n;i++)
            for(int j = i+1;j<n;j++)
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    graph[i].add(j);
                    graph[j].add(i);
                }



        for(int i = 0;i<n;i++){
            if(!visited.contains(i)){
                dfs(i);
                numOfIslands++;
            }
        }
        return n - numOfIslands;
    }

    public void dfs(int node){
        if(visited.contains(node)) return;
        for(int adjacent : graph[node])
            dfs(adjacent);
    }
}
