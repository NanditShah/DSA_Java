package Learning.Stack;

public class StaticStack {
    protected int [] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
    public StaticStack() {
        this(DEFAULT_SIZE);
    }

    public StaticStack(int size) {
        this.data = new int[size];
    }

    public void push(int val) throws StackException{
        if(isFull()){
            throw new StackException("Learning.Stack is full");
        }
        ptr++;
        this.data[ptr] = val;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Learning.Stack is empty");
        }
        return this.data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Learning.Stack is empty");
        }
        return this.data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}
