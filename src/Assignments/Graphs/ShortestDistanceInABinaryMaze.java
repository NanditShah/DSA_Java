package Assignments.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestDistanceInABinaryMaze {
    public static void main(String[] args) {
        System.out.println("Shortest Distance in a Binary Maze");
    }

    class Pair{
        int x;
        int y;
        int weight;

        public Pair(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }
    }


    public int[] dirs = {0,1,0,-1,0};

    public int shortestPath(int[][] grid, int[] source, int[] destination) {

        if(source[0] == destination[0] && source[1] == destination[1]) return 0;

        int m = grid.length;
        int n = grid[0].length;


        int[][] distances = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                distances[i][j] = Integer.MAX_VALUE;
            }
        }

        distances[source[0]][source[1]] = 0;


        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(source[0],source[1],0));

        while(!queue.isEmpty()){
            Pair removedPair = queue.remove();
            int row = removedPair.x;
            int col = removedPair.y;
            int distance = removedPair.weight;

            for(int i = 0;i<4;i++){
                int pRow = row + dirs[i];
                int pCol = col + dirs[i+1];

                if(pRow >= 0 && pRow < m && pCol >= 0 && pCol < n && grid[pRow][pCol] != 0){
                    if(distance+grid[pRow][pCol] < distances[pRow][pCol]){
                        distances[pRow][pCol] = distance+grid[pRow][pCol];
                        queue.add(new Pair(pRow,pCol,distance+grid[pRow][pCol]));
                    }

                    if(pRow == destination[0] && pCol == destination[1]){
                        return distance+grid[pRow][pCol];
                    }
                }
            }
        }

        return -1;

    }
}
