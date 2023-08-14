package Assignments.Easy;

import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public static void main(String[] args) {
        System.out.println("Total Cost to KWorkers");
    }

    public long totalCost(int[] costs, int k, int candidates) {
        int i = 0;
        int j = costs.length - 1;
        PriorityQueue<Integer> pqStart = new PriorityQueue<>();
        PriorityQueue<Integer> pqEnd = new PriorityQueue<>();

        long totalCost = 0;
        while (k-- > 0) {
            while (pqStart.size() < candidates && i <= j) {
                pqStart.add(costs[i++]);
            }
            while (pqEnd.size() < candidates && i <= j) {
                pqEnd.add(costs[j--]);
            }

            int t1 = pqStart.size() > 0 ? pqStart.peek() : Integer.MAX_VALUE;
            int t2 = pqEnd.size() > 0 ? pqEnd.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                totalCost += t1;
                pqStart.remove();
            } else {
                totalCost += t2;
                pqEnd.remove();
            }
        }
        return totalCost;
    }
}
