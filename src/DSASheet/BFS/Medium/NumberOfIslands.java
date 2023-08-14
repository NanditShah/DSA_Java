package DSASheet.BFS.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        System.out.println("Number of Islands");
    }

    class Pair {
        int value,row,col;

        public Pair(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
    int numOfIslands = 0;
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        int m = grid.length,n = grid[0].length;
        visited = new boolean[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    numOfIslands++;
                    bfs(grid,i,j);
                }
            }
        }
        return numOfIslands;
    }


    public void bfs(char[][] grid,int row,int col){
        Queue<Pair> helperQ = new LinkedList<>();
        helperQ.add(new Pair(grid[row][col],row,col));
        visited[row][col] = true;

        while(!helperQ.isEmpty()){
            Pair topPair = helperQ.remove();
            for(int[] dir : dirs){
                int x = topPair.row + dir[0];
                int y = topPair.col + dir[1];
                if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && !visited[x][y] && grid[x][y] == '1'){
                    visited[x][y] = true;
                    helperQ.add(new Pair(grid[x][y],x,y));
                }
            }
        }
    }
}
