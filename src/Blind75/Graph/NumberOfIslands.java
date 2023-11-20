package Blind75.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println("Number of Islands");
    }

    public int numIslands(char[][] grid) {
        int m = grid.length,n = grid[0].length;

        Queue<int[]> helperQueue = new LinkedList<>();

        int numOfIslands = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    helperQueue.add(new int[] {i,j});
                    grid[i][j] = 'X';
                    bfs(helperQueue,grid,m,n);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public void bfs(Queue<int[]> helperQueue,char[][] grid,int m,int n){
        while(!helperQueue.isEmpty()){
            int[] currentCorr = helperQueue.remove();

            for(int[] dir : dirs){
                int _x = currentCorr[0] + dir[0];
                int _y = currentCorr[1] + dir[1];
                if(_x >= 0 && _x < m && _y >= 0 && _y < n && grid[_x][_y] == '1'){
                    grid[_x][_y] = 'X';
                    helperQueue.add(new int[] {_x,_y});

                }
            }
        }
    }

}
