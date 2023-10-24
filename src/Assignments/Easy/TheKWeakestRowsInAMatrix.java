package Assignments.Easy;

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        System.out.println("The K Weakest Rows in a Matrix");
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rowStrengths = new int[mat.length][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        for (int i = 0; i < mat.length; ++i) {
            int strength = 0;
            for (int val : mat[i]) {
                strength += val;
            }
            pq.add(new int[] {i,strength});
        }

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = pq.remove()[0];
        }

        return result;
    }
}
