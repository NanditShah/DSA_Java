package DSASheet.BFS.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        System.out.println("Rotting Oranges");

        int[][] grid = {
                {0,2},
        };

        System.out.println(orangesRotting(grid));

    }

    static int dirs[][] = {{-1,0},{0,-1},{1,0},{0,1}};
    static class Pair {
        int row,col,time;

        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public static int orangesRotting(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int[][] visited = new int[m][n];
        int perfectOranges = 0;
        int count = 0;
        int time = 0;
        Queue<Pair> helperQueue = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j< n;j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    helperQueue.add(new Pair(i,j,0));
                }else visited[i][j] = 0;
                if(grid[i][j] == 1){
                    perfectOranges++;
                }
            }
        }

        while(!helperQueue.isEmpty()){
            int qSize = helperQueue.size();
            for(int i = 0;i<qSize;i++){
                Pair topPair = helperQueue.remove();
                time = Math.max(topPair.time,time);
                for(int[] dir : dirs){
                    int x = topPair.row + dir[0], y = topPair.col + dir[1];

                    if(x >= 0 && x < m && y >= 0 && y < n &&
                            visited[x][y] != 2 && grid[x][y] == 1){
                        helperQueue.add(new Pair(x,y,topPair.time+1));
                        visited[x][y] = 2;
                        count++;
                    }
                }
            }
        }

        return perfectOranges != count ? -1 : time;
    }
}
