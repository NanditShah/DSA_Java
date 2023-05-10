package Assignments.Graphs;

import Assignments.Graphs.Disjoint.Disjoint;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslandsII {
    public static void main(String[] args) {
        System.out.println("Number of Islands - II");
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};

    public List<Integer> numOfIslands(int n, int m, int[][] operators) {
        Disjoint ds = new Disjoint(n*m);

        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int[][] visited = new int[n][m];

        for(int i = 0;i<operators.length;i++){
            int u = operators[i][0];
            int v = operators[i][1];

            if(visited[u][v] == 1){
                ans.add(count);
                continue;
            }

            visited[u][v] = 1;
            count++;

            for(int j = 0;j<4;j++){
                int x = dirs[j];
                int y = dirs[j+1];

                if(x >= 0 && x < n && y >= 0 && y < m){
                    int adjU = u + x;
                    int adjV = v + y;

                    if(visited[adjU][adjV] == 1){
                        int nodeNo = u*m+v;
                        int adjNodeNo = adjU*m+adjV;

                        if(ds.findParent(nodeNo) != ds.findParent(adjNodeNo)){
                            count--;
                            ds.unionByRank(nodeNo,adjNodeNo);
                        }
                    }
                }
            }
            ans.add(count);
        }


        return ans;

    }
}
