package Grind75;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        System.out.println("Rotting Oranges");
    }

    class Pair{
        int x,y,time;

        public Pair(int x, int y,int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int count = 0, totalFreshOranges = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<Pair> helperQueue = new LinkedList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 2){
                    helperQueue.add(new Pair(i,j,0));
                }else if(grid[i][j] == 1)
                    totalFreshOranges++;
            }
        }

        int time = 0;

        while(!helperQueue.isEmpty()){
            Pair topPair = helperQueue.remove();
            time = Math.max(time,topPair.time);
            for(int[] dir : dirs){
                int x = dir[0]+topPair.x, y = dir[1]+topPair.y;
                if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1){
                    count++;
                    helperQueue.add(new Pair(x,y,topPair.time+1));
                    grid[x][y] = 2;
                }
            }
        }

        return count == totalFreshOranges ? time : -1;
    }
}
