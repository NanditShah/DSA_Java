package DSASheet.Graph.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarFromLandAsPossible {
    public static void main(String[] args) {
        System.out.println("As Far from Land as Possible");
    }

    public int maxDistance(int[][] grid) {
        int[][] dirs = {{0,1},{-1,0},{0,-1},{1,0}};

        int n = grid.length;
        Queue<int[]> helperQueue = new LinkedList<>();
        int res = -1;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1) helperQueue.add(new int[] {i,j});
            }
        }

        if(helperQueue.size() == 0 || helperQueue.size() == n*n) return -1;

        while(!helperQueue.isEmpty()){
            int[] xy = helperQueue.remove();
            res = grid[xy[0]][xy[1]];
            for(int[] dir : dirs){
                int newX = xy[0] + dir[0];
                int newY = xy[1] + dir[1];

                if(newX >= 0 && newX < n && newY >= 0 && newY < n && grid[newX][newY] == 0){
                    grid[newX][newY] = grid[xy[0]][xy[1]] + 1;
                    helperQueue.add(new int[] {newX,newY});
                }
            }
        }
        return res > 1 ? res - 1 : -1;
    }
}
