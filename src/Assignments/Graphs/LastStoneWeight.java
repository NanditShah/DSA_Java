package Assignments.Graphs;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        System.out.println("Last Stone Weight");

        System.out.println(lastStoneWeight(new int[] {1}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int stone : stones){
            pQueue.add(stone);
        }

        while(pQueue.size() > 1){
            int bigStone = pQueue.remove();
            int smallStone = pQueue.remove();

            if(smallStone != bigStone){
                pQueue.add(bigStone - smallStone);
            }
        }

        if(pQueue.size() == 0) return 0;
        return pQueue.remove();
    }
}
