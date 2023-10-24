package Grind75;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        System.out.println("Min Stack");
    }

    Stack<int[]> stk;
    public MinStack() {
        stk = new Stack<>();
    }

    public void push(int val) {
        if(stk.isEmpty()){
            stk.push(new int[] {val,val});
        }else{
            stk.push(new int[] {val,Math.min(val,stk.peek()[1])});
        }
    }

    public void pop() {
        stk.pop();
    }

    public int top() {
        return stk.peek()[0];
    }

    public int getMin() {
        return stk.peek()[1];
    }
}
