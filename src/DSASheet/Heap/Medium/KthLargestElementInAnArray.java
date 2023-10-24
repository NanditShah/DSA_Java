package DSASheet.Heap.Medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        System.out.println("Kth Largest Element in an Array");
    }

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> a - b);

        for(int num : nums) heap.add(num);

        while(heap.size() > k) heap.remove();

        return heap.poll();
    }
}
