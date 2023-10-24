package DSASheet.Heap.Hard;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println("Sliding Window Maximum");
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int index = 0;
        Deque<Integer> dequeue = new ArrayDeque<>();
        int r = 0,l = 0;

        for(int i =0;i<n;i++){
            while(!dequeue.isEmpty() && nums[dequeue.peekLast()] < nums[i]) dequeue.removeLast();
            dequeue.add(i);
            while(l > dequeue.peekFirst()) dequeue.removeFirst();
            if((r + 1) >= k){
                ans[index++] = nums[dequeue.peekFirst()];
                l+=1;
            }
            r+=1;
        }
        return ans;
    }
}
