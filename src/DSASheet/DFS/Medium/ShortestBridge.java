package DSASheet.DFS.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    public static void main(String[] args) {
        System.out.println("Shortest Bridge");
        int[][] grid = {
                {1,0,0},
                {0,0,0},
                {0,0,1}
        };
        int shortest = shortestBridge(grid);
        System.out.println(shortest);
    }

    static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public static int shortestBridge(int[][] grid) {
        Queue<int[]> bfsQueue = new LinkedList<>();
        boolean flag = false;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    dfs(grid,bfsQueue,i,j);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        return bfs(bfsQueue,grid);
    }

    public static void dfs(int[][] grid,Queue<int[]> bfsQueue,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == -1) return;

        bfsQueue.add(new int[] {i,j});
        grid[i][j] = -1;
        for(int[] dir : dirs){
            dfs(grid,bfsQueue,i+dir[0],j+dir[1]);
        }
    }

    public static int bfs(Queue<int[]> bfsQueue,int[][] grid){
        int level = 0;
        while(!bfsQueue.isEmpty()){
            int size = bfsQueue.size();
            while(size > 0){
                int[] coordinate = bfsQueue.remove();
                for(int[] dir : dirs){
                    int newI = coordinate[0]+dir[0];
                    int newJ = coordinate[1]+dir[1];
                    if(newI < 0 || newJ < 0 || newI >= grid.length || newJ >= grid[0].length || grid[newI][newJ] == -1) continue;
                    if(grid[newI][newJ] == 1) return level;
                    bfsQueue.add(new int[] {newI,newJ});
                    grid[newI][newJ] = -1;
                }
                size --;
            }
            level++;
        }
        return level;
    }
}
