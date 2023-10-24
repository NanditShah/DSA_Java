package DSASheet.SlidingWindow;

import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian {
    public static void main(String[] args) {
        System.out.println("Sliding Window Median");
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        int i = 0,j = 0,p = 0,n = nums.length;
        double[] ans = new double[n - k + 1];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while(j < n){
            if(maxHeap.size() <= minHeap.size()){
                minHeap.add(nums[j]);
                maxHeap.add(minHeap.poll());
            }else{
                maxHeap.add(nums[j]);
                minHeap.add(minHeap.poll());
            }
            if(j - i + 1 == k){
                if(maxHeap.size() == minHeap.size()){
                    ans[p++] = (double) ((long)maxHeap.peek() + (long)minHeap.peek()) / 2.0;
                }else{
                    ans[p++] = (double) (maxHeap.peek());
                }
                if(!maxHeap.remove(nums[i])) minHeap.remove(nums[i]);
                i++;
            }
            j++;
        }
        return ans;
    }
}
