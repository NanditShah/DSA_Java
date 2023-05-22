package Assignments.Graphs;

import java.util.LinkedList;
import java.util.Queue;


//It has some error in it
public class ShortestBridge {
    public static void main(String[] args) {
        System.out.println("Shortest Bridge");
    }


    public int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        Queue<Pair> queue = new LinkedList<>();

        boolean found = false;
        int steps = 0;

        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                dfs(i,j,grid,visited,queue,n);
                found = true;
                break;
            }
            if(found) break;
        }


        while(!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0) {
            Pair currPair = queue.poll();
            for(int[] dir : dirs){
                int i = currPair.x + dir[0];
                int j = currPair.y + dir[1];
                if(i >= 0 && j >= 0 && i < n && j < n && !visited[i][j]){
                    if(grid[i][j] == 1) return steps;
                    queue.add(new Pair(i,j));
                    visited[i][j] = true;
                }
            }
            }
            steps++;
        }
        return -1;
    }

    public void dfs(int i,int j,int[][] grid,boolean[][] visited,Queue<Pair> queue,int n){
        if (i < 0 || j < 0 || i >= n || j >= n || visited[i][j] || grid[i][j] == 0)
            return;
        visited[i][j] = true;
        queue.add(new Pair(i,j));
        for(int[] dir : dirs){
            dfs(i + dir[0],j + dir[1],grid,visited,queue,n);
        }
    }
    public boolean isValidPath(int x,int y,int n){
        if(x >= 0 && x < n && y >= 0 && y < n) return true;
        return false;
    }

    class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}



