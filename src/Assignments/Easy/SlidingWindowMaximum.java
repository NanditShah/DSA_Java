package Assignments.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println("Sliding Window Maximum");
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] r = new int[nums.length-k+1];
        int ri = 0;

        Deque<Integer> dequeue = new ArrayDeque<>();

        for(int i =0;i<nums.length;i++){
            if(!dequeue.isEmpty() && dequeue.peek() == i-k){
                dequeue.poll();
            }

            while(!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]){
                dequeue.pollLast();
            }

            dequeue.offer(i);
            if(i >= k-1){
                r[ri++] = nums[dequeue.peek()];
            }
        }
        return r;
    }
}
