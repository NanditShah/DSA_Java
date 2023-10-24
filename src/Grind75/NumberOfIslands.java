package Grind75;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println("Number of Islands");
    }

    class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int totalNoIslands = 0;

        Queue<Pair> helperQueue = new LinkedList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    totalNoIslands++;
                    grid[i][j] = 'X';
                    helperQueue.add(new Pair(i,j));
                    bfs(grid,i,j,helperQueue,m,n);
                }
            }
        }
        return totalNoIslands;
    }

    public void bfs(char[][] grid,int i,int j,Queue<Pair> helperQueue,int m,int n){

        while(!helperQueue.isEmpty()){
            Pair topPair = helperQueue.remove();

            for(int[] dir : dirs){
                int x = topPair.x + dir[0];
                int y = topPair.y + dir[1];
                if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1'){
                    helperQueue.add(new Pair(x,y));
                    grid[x][y] = 'X';
                }
            }
        }
    }
}
