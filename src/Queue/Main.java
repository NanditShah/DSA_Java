package Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        SingleQueue singleQueue = new SingleQueue(5);

        singleQueue.enqueue(5);
        singleQueue.enqueue(10);
        singleQueue.enqueue(15);
        singleQueue.enqueue(20);
        singleQueue.enqueue(25);

        singleQueue.dequeue();
        singleQueue.dequeue();
        singleQueue.dequeue();
        singleQueue.dequeue();
        singleQueue.dequeue();

    }
}
