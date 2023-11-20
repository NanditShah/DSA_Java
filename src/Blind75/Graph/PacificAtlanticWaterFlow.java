package Blind75.Graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        System.out.println("Pacific Atlantic Water Flow");
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

//        Running on the top and bottom row
        for(int i = 0;i<n;i++){
            dfs(heights,pacific,m,n,heights[0][i],0,i);
            dfs(heights,atlantic,m,n,heights[m - 1][i],m-1,i);
        }


//        Running on left and right column
        for(int i = 0;i<m;i++){
            dfs(heights,pacific,m,n,heights[i][0],i,0);
            dfs(heights,atlantic,m,n,heights[i][n - 1],i,n-1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }


        return ans;
    }

    int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};

    private void dfs(int[][] heights, boolean[][] visited, int m, int n,int prevHeight ,int x,int y) {
        if(x < 0 || x >= m || y < 0 || y >= n || visited[x][y] || prevHeight < heights[x][y]) return;

        visited[x][y] = true;

        for(int[] dir : dirs)
            dfs(heights,visited,m,n,heights[x][y],x+dir[0],y+dir[1]);
    }
}
