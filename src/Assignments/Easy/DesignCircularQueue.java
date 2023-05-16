package Assignments.Easy;

public class DesignCircularQueue {

    public static void main(String[] args) {
        System.out.println("Design Circular Learning.Queue");


          MyCircularQueue obj = new MyCircularQueue(3);
          boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.enQueue(3);
//        boolean param_4 = obj.enQueue(4);
//          boolean param_2 = obj.deQueue();
          int front = obj.Front();
          int rear= obj.Rear();
        System.out.println(front+" "+rear);
          boolean param_5 = obj.isEmpty();
          boolean param_6 = obj.isFull();

    }
}

class MyCircularQueue {


    protected int[] data;

    protected int end = -1;
    protected int front = 0;
    private int size = 0;

    public MyCircularQueue(int k) {
        this.data = new int[k];
    }


    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        end++;
        end = end % data.length;
        data[end] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return data[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return data[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}
