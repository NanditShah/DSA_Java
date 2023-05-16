package Assignments.Easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        System.out.println("Implement Learning.Queue using Stacks");
    }


}
class MyQueue {

    Stack<Integer> first;
    Stack<Integer> second;
    public MyQueue() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        if(empty()){
            return -1;
        }else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            int removed = second.pop();

            while(!second.isEmpty()){
                first.push(second.pop());
            }

            return removed;
        }
    }

    public int peek() {
        if(empty()){
            return -1;
        }else{
            while(!first.isEmpty()){
                second.push(first.pop());
            }

            int peeked = second.peek();

            while(!second.isEmpty()){
                first.push(second.pop());
            }

            return peeked;
        }
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
