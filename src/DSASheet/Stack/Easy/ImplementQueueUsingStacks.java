package DSASheet.Stack.Easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        System.out.println("Implement Queue using Stacks");
    }

    class MyQueue {

        Stack<Integer> stk1;
        Stack<Integer> stk2;
        public MyQueue() {
            stk1 = new Stack<>();
            stk2 = new Stack<>();
        }

        public void push(int x) {
            stk1.push(x);
        }

        public int pop() {
            while(!stk1.isEmpty())
                stk2.push(stk1.pop());

            int removedValues = stk2.pop();

            while(!stk2.isEmpty())
                stk1.push(stk2.pop());

            return removedValues;
        }

        public int peek() {
            while(!stk1.isEmpty())
                stk2.push(stk1.pop());

            int topValue = stk2.peek();

            while(!stk2.isEmpty())
                stk1.push(stk2.pop());

            return topValue;
        }

        public boolean empty() {
            return stk1.isEmpty();
        }
    }
}
