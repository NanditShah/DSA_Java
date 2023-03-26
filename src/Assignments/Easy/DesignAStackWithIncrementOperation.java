package Assignments.Easy;

public class DesignAStackWithIncrementOperation {


    class CustomStack {

        int[] stack;
        int ptr = -1;

        public CustomStack(int maxSize) {
            this.stack = new int[maxSize];
        }

        public void push(int x) {
            System.out.println(ptr);
            if(ptr != stack.length - 1){
                stack[ptr++] = x;
            }
        }

        public int pop() {
            if(ptr == -1){
                return  - 1;
            }
            int removed =  stack[ptr];
            ptr --;
            return removed;
        }

        public void increment(int k, int val) {
            for(int i = 0;i<k && i<= ptr;i++){
                stack[i] += val;
            }
        }
    }
}
