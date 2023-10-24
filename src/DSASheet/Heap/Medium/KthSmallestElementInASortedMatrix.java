package DSASheet.Heap.Medium;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    public static void main(String[] args) {
        System.out.println("Kth Smallest Element in a Sorted Matrix");
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        System.out.println(kthSmallest(matrix,8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                pq.add(matrix[i][j]);
            }
        }

        while(!pq.isEmpty() && k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}
