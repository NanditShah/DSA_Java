package Assignments.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        System.out.println("Rotting Oranges");
    }

    class Pair {
        int row;
        int col;
        int time;

        public Pair(int row,int col,int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};


    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        Queue<Pair> bfsQueue = new LinkedList<>();

        int perfectOranges = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    bfsQueue.add(new Pair(i,j,0));
                }else{
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    perfectOranges ++;
                }
            }
        }

        int time = 0;
        int count = 0;

        while(!bfsQueue.isEmpty()){
            Pair p = bfsQueue.remove();
            int r = p.row;
            int c = p.col;
            int t = p.time;

            time = Math.max(time,t);

            for(int k = 0;k<4;k++){
                int nRow = r + dirs[k];
                int nCol = c + dirs[k+1];

                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && visited[nRow][nCol] == 0 && grid[nRow][nCol] == 1){
                    bfsQueue.add(new Pair(nRow,nCol,t+1));
                    visited[nRow][nCol] = 2;
                    count++;
                }
            }
        }

        if(count != perfectOranges) return -1;
        return time;
    }
}
