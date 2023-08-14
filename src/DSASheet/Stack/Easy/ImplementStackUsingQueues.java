package DSASheet.Stack.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        System.out.println("Implement Stack using Queues");
    }

    class MyStack {
        Queue<Integer> q1;
        public MyStack() {
            q1 = new LinkedList<>();
        }

        public void push(int x) {
            q1.add(x);
            for(int i=0; i<q1.size()-1; i++){
                q1.add(q1.remove());
            }
        }

        public int pop() {
            return q1.remove();
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }
}
