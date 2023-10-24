package Grind75;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("K Closest Points to Origin");
        int[][] array = {
                {3, 3},
                {5, -1},
                {-2,4}
        };
        int[][] ans = kClosest(array,2);
        print2DArray(ans);
    }

    static class DistComapre implements Comparator<int[]> {

        public int compare(int[] s1, int[] s2) {
            int dist1 = (s1[0] - 0)*(s1[0] - 0) + (s1[1] - 0)*(s1[1] - 0);
            int dist2 = (s2[0] - 0)*(s2[0] - 0) + (s2[1] - 0)*(s2[1] - 0);

            if (dist1 < dist2)
                return -1;
            else if (dist1 > dist2)
                return 1;
            return 0;
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(new DistComapre());

        for(int[] point : points){
            heap.add(point);
        }

        int[][] ansPoints = new int[k][2];
        while(k > 0){
            k--;
            ansPoints[k] = heap.remove();
        }
        return ansPoints;
    }
}
