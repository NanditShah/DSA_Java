package Grind75;

import java.util.*;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        System.out.println("Pacific Atlantic Water Flow");
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length, n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for(int c = 0;c<n;c++){
            dfs(0,c,pacific,heights[0][c],heights);
            dfs(m - 1,c,atlantic,heights[0][c],heights);
        }

        for(int r = 0;r<m;r++){
            dfs(r,0,pacific,heights[r][0],heights);
            dfs(r,n - 1,atlantic,heights[0][r],heights);
        }

        List<List<Integer>> ansList = new ArrayList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ansList.add(list);
                }
            }
        }

        return ansList;
    }

    public void dfs(int x,int y,boolean[][] visited,int previousHeight,int[][] heights){
        int m = heights.length, n = heights[0].length;
        if(x < 0 || y < 0 || x >= m || y >= n || visited[x][y]) return;

        visited[x][y] = true;

        dfs(x+1,y,visited,heights[x][y],heights);
        dfs(x-1,y,visited,heights[x][y],heights);
        dfs(x,y+1,visited,heights[x][y],heights);
        dfs(x,y-1,visited,heights[x][y],heights);
    }
}
