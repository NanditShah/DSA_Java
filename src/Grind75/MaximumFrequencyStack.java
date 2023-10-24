package Grind75;

import java.util.HashMap;
import java.util.Stack;

public class MaximumFrequencyStack {
    public static void main(String[] args) {
        System.out.println("Maximum Frequency Stack");
    }

    class FreqStack {

        int maxCount;
        HashMap<Integer,Integer> counter;
        HashMap<Integer, Stack<Integer>> groupByCount;

        public FreqStack() {
            maxCount = 0;
            counter = new HashMap<>();
            groupByCount = new HashMap<>();
        }

        public void push(int val) {
            int newValCount = counter.getOrDefault(val,0)+1;
            counter.put(val,newValCount);

            if(maxCount < newValCount){
                maxCount = newValCount;
                groupByCount.put(maxCount,new Stack<>());
            }
            groupByCount.get(newValCount).push(val);
        }

        public int pop() {
            int removedVal = groupByCount.get(maxCount).pop();
            if(groupByCount.get(maxCount).isEmpty()) maxCount = maxCount - 1;
            counter.put(removedVal,counter.get(removedVal) - 1);
            return removedVal;
        }
    }
}
