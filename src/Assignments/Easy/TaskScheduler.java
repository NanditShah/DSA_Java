package Assignments.Easy;

import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
        System.out.println("Task Scheduler");
        System.out.println(leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 1));
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] taskFreq = new int[26];

        for (char c : tasks) {
            taskFreq[c - 'A']++;
        }
        Arrays.sort(taskFreq);

        PriorityQueue<Integer> tasksQueue
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

//        Learning.Queue<Integer> tasksQueue = new LinkedList<>();
        Queue<int[]> idleQueue = new LinkedList<>();
        int time = 0;

        for (int i = 25; i >= 0; i--) {
            if (taskFreq[i] != 0) {
                tasksQueue.add(taskFreq[i]);
            }
        }

        System.out.println(tasksQueue);
        while (tasksQueue.size() > 0 || idleQueue.size() > 0) {
            time++;
            if (tasksQueue.size() > 0) {
                int count = tasksQueue.poll() - 1;
                System.out.println(count);
                if (count > 0) {
                    idleQueue.add(new int[]{count, time + n});
                }
            }
            if (idleQueue.size() > 0 && time == idleQueue.peek()[1] && idleQueue.peek()[0] > 0) {
                tasksQueue.add(idleQueue.poll()[0]);
            }
            System.out.println(tasksQueue);
        }

        return time;
    }
}