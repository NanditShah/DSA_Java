package Queue;

import Stack.StackException;

public class SingleQueue {
    protected int [] data;
    int ptr = 0;
    private static final int DEFAULT_SIZE = 10;
    public SingleQueue() {
        this(DEFAULT_SIZE);
    }

    public SingleQueue(int size) {
        this.data = new int[size];
    }

    public boolean enqueue(int val) {
        if(isFull()){
            return false;
        }
        this.data[ptr] = val;
        ptr++;
        return true;
    }

    public void dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        for(int i = 1;i<ptr;i++){
            this.data[i-1] = this.data[i];
        }
        ptr--;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return this.data[0];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
