package Grind75;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler {
    public static void main(String[] args) {
        System.out.println("Task Scheduler");
    }

    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;
        int[] freqArr = new int[27];

        for(char task : tasks) freqArr[task - 'a']++;
        PriorityQueue<Integer> taskQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> waitingQueue = new LinkedList<>();

        for(int freq : freqArr) if(freq != 0) taskQueue.add(freq);

        int time = 0;
        while(!waitingQueue.isEmpty() || !taskQueue.isEmpty()){
            time++;

            if(!taskQueue.isEmpty()){
                int count = taskQueue.remove() - 1;
                if(count > 0) waitingQueue.add(new int[] {count,time+n});
            }

            if(!waitingQueue.isEmpty() && time == waitingQueue.peek()[1]) taskQueue.add(waitingQueue.remove()[0]);
        }
        return time;
    }
}
