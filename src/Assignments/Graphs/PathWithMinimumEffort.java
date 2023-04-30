package Assignments.Graphs;

import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    public static void main(String[] args) {
        System.out.println("Path With Minimum Effort");
    }

    class Pair{
        int x;
        int y;
        int diff;

        public Pair(int x, int y, int diff) {
            this.x = x;
            this.y = y;
            this.diff = diff;
        }
    }

    public int[] dirs = {0,1,0,-1,0};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] distances = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j= 0 ;j<n;j++){
                distances[i][j] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.diff - y.diff);

        distances[0][0] = 0;
        pq.add(new Pair(0,0,0));

        while(!pq.isEmpty()){
            Pair removedPair = pq.remove();
            int row = removedPair.x;
            int col = removedPair.y;
            int distance = removedPair.diff;

            for(int i = 0;i<4;i++){
                int pRow = row + dirs[i];
                int pCol = col + dirs[i+1];

                if(pRow >= 0 && pRow < m && pCol >= 0 && pCol < n){
                    int effort = Math.max(distance,Math.abs(heights[row][col] - heights[pRow][pCol]));

                    if(effort < distances[pRow][pCol]){
                        distances[pRow][pCol] = effort;
                        pq.add(new Pair(pRow,pCol,effort));
                    }
                }
            }
        }

        return distances[m-1][n-1];

    }
}
