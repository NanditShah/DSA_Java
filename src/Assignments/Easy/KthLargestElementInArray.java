package Assignments.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        System.out.println("Kth Largest Element in an Array");
    }

    static int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (final int num : nums) {
            minHeap.offer(num);
            while (minHeap.size() > k)
                minHeap.poll();
        }

        return minHeap.peek();
    }
}
