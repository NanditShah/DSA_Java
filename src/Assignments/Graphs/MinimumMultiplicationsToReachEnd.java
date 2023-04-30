package Assignments.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumMultiplicationsToReachEnd {
    public static void main(String[] args) {
        System.out.println("Minimum Multiplications to Reach End");
        int start=3, end=30;
        int[] arr = {2,5,7};

        int ans = minimumMultiplications(arr,start,end);

        System.out.print(ans);
        System.out.println();
    }

    public static int minimumMultiplications(int[] arr,int start, int end) {

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> a.steps - b.steps);

        int[] minSteps = new int[100000];

        for(int i = 0;i<100000;i++){
            minSteps[i] = Integer.MAX_VALUE;
        }

        minSteps[start] = 0;
        pq.add(new Pair(start,0));


        while(!pq.isEmpty()){
            Pair removedPair = pq.remove();
            int num = removedPair.number;
            int steps = removedPair.steps;

            for(int numToMultiply : arr){
                int newNum = (num * numToMultiply) % 100000;

                if(steps+1 < minSteps[newNum]){
                    if(end == newNum) return steps + 1;
                    pq.add(new Pair(newNum,steps+1));
                }
            }
        }

        return -1;
    }
}

class Pair{
    int number,steps;

    public Pair(int number, int steps) {
        this.number = number;
        this.steps = steps;
    }
}

