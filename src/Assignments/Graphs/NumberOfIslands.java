package Assignments.Graphs;

import java.util.*;

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println("Number of Islands");

        char[][] grid= {{'1','0','1','1','0','1','1'}};

//        System.out.println(numIslands(grid));

    }

    class Pair{
        int row;
        int col;

        public Pair(int row,int col){
            this.row = row;
            this.col = col;
        }
    }
    private static final int[] dirs = {0, 1, 0, -1, 0};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];

        int islandCount = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == ('1') && visited[i][j] != 1){
                    islandCount++;
                    bfs(i,j,visited,grid,n,m);
                }

            }
        }

        return islandCount;

    }

    public void bfs(int row,int col, int[][] visited,char[][] grid,int n,int m){
        visited[row][col] = 1;
        Queue<Pair> bfsQueue = new LinkedList<>();

        bfsQueue.add(new Pair(row,col));

        while (!bfsQueue.isEmpty()){
            Pair vertexPair = bfsQueue.remove();
            int r = vertexPair.row;
            int c = vertexPair.col;

            for (int k = 0; k < 4; ++k) {
                int nRow = r + dirs[k];
                int nCol = c +  dirs[k + 1];
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == '1' && visited[nRow][nCol] != 1){
                    visited[nRow][nCol] = 1;
                    bfsQueue.add(new Pair(nRow,nCol));
                }
            }
        }
    }


}
