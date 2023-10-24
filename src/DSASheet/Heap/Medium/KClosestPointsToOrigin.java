package DSASheet.Heap.Medium;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        System.out.println("K Closest Points to Origin");
    }

    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];


        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        int i = 0;
        for(int[] point : points){
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            heap.add(new int[] {i,distance});
            i++;
        }

        while(k>0 && !heap.isEmpty()){
            ans[k-1] = points[heap.remove()[0]];
            k--;
        }
        return ans;
    }
}
