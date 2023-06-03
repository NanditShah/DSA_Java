package DSASheet.Arrays.Hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MaxValueOfEquation {
    public static void main(String[] args) {
        System.out.println("Max Value of Equation");
    }

    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<int[]> q = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        for (int[] p : points) {
            int x = p[0], y = p[1];
            while (!q.isEmpty() && x - q.peekFirst()[0] > k) {
                q.poll();
            }
            if (!q.isEmpty()) {
                ans = Math.max(ans, y + x + q.peekFirst()[1] - q.peekFirst()[0]);
            }
            while (!q.isEmpty() && y - x > q.peekLast()[1] - q.peekLast()[0]) {
                q.pollLast();
            }
            q.offer(p);
        }
        return ans;
    }
}
