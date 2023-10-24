package Grind75;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
    public static void main(String[] args) {
        System.out.println("Find Median from Data Stream");
    }

    class MedianFinder {

        PriorityQueue<Integer> minHeap;
        PriorityQueue<Integer> maxHeap;
        public MedianFinder() {
            minHeap = new PriorityQueue<>(Collections.reverseOrder());
            maxHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
            if(maxHeap.size() < minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {
            if(maxHeap.size() == minHeap.size()) return (maxHeap.peek() + minHeap.peek()) / 2.0;
            return maxHeap.peek();
        }
    }
}
