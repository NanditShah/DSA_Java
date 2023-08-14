package DSASheet.Greedy.Medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    public static void main(String[] args) {
        System.out.println("Task Scheduler");
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[27];
        for(char task : tasks) freq[task - 'A']++;

        PriorityQueue<Integer> taskQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> idleQueue = new LinkedList<>();

        for(int singularFreq : freq) if(singularFreq != 0) taskQueue.add(singularFreq);

        int time = 0;
        while(!taskQueue.isEmpty() || !idleQueue.isEmpty()){
            time++;
            if(!taskQueue.isEmpty()){
                int count = taskQueue.remove() - 1;
                if(count > 0) idleQueue.add(new int[] {count,time+n});
            }

            if(!idleQueue.isEmpty() && time == idleQueue.peek()[1]) taskQueue.add(idleQueue.remove()[0]);
        }
        return time;
    }


}
