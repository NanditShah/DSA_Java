package DSASheet.Heap.Hard;

import java.util.PriorityQueue;

public class SwimInRisingWater {
    public static void main(String[] args) {
        System.out.println("Swim in Rising Water");
    }

    class Coordinates {
        int x,y,value;

        public Coordinates(int x,int y,int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public int swimInWater(int[][] grid) {
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int n = grid.length;
        PriorityQueue<Coordinates> helperQueue = new PriorityQueue<>((a,b) -> a.value - b.value);
        helperQueue.add(new Coordinates(0,0,grid[0][0]));

        while(!helperQueue.isEmpty()){
            Coordinates topCoordinates = helperQueue.remove();
            if(topCoordinates.x == n - 1 && topCoordinates.y == n - 1) return topCoordinates.value;
            for(int[] dir : dirs){
                int newX = dir[0] + topCoordinates.x;
                int newY = dir[1] + topCoordinates.y;

                if(newX >= 0 && newY >= 0 && newX < n && newY < n && grid[newX][newY] != -1){
                    helperQueue.add(new Coordinates(newX,newY,Math.max(topCoordinates.value,grid[newX][newY])));
                    grid[newX][newY] = -1;
                }
            }
        }
        return -1;
    }
}
