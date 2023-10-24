package DSASheet.Heap.Hard;

import java.util.PriorityQueue;

public class MinimumNumberOfRefuelingStops {
    public static void main(String[] args) {
        System.out.println("Minimum Number of Refueling Stops");
    }

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int maxReach = startFuel;

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        int index = 0;
        int count = 0;
        while(maxReach < target){

            while(index < stations.length && stations[index][0] <= maxReach) {
                heap.add(stations[index][1]);
                index++;
            }

            if(heap.isEmpty()) return -1;

            maxReach += heap.remove();
            count++;
        }

        return count;
    }
}
