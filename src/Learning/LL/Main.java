package Learning.LL;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList Implementation");


        LL linkedList = new LL();
        linkedList.insertAtFirst(2);
        linkedList.insertAtFirst(3);
        linkedList.insertAtFirst(15);
        linkedList.insertAtFirst(7);
        linkedList.insertAtFirst(90);

        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);

        linkedList.insertAt(4,100);
        linkedList.insertAt(5,200);
        linkedList.insertAt(6,300);
//        linkedList.insertAt(15,3000);

        linkedList.insertUsingRec(3,1000);

        linkedList.display();

        linkedList.deleteHead();
        linkedList.deleteHead();

        linkedList.deleteTail();

        linkedList.display();

        linkedList.deleteAt(2);

        linkedList.display();

        int foundNodeIndex = linkedList.find(200);
        System.out.println(foundNodeIndex);


//        System.out.println("Doubly LinkedList Implementation");
//
//
//        DLL dLinkedList = new DLL();
//        dLinkedList.insertAtFirst(2);
//        dLinkedList.insertAtFirst(3);
//        dLinkedList.insertAtFirst(15);
//        dLinkedList.insertAtFirst(7);
//        dLinkedList.insertAtFirst(90);
//
//        dLinkedList.insertAtEnd(4);
//        dLinkedList.insertAtEnd(5);
//        dLinkedList.insertAtEnd(6);
//
//        dLinkedList.insertAt(4,100);
//        dLinkedList.insertAt(5,200);
//        dLinkedList.insertAt(6,300);
////        linkedList.insertAt(15,3000);
//
//        dLinkedList.display();
//
//        dLinkedList.deleteHead();
//        dLinkedList.deleteHead();
//
//        dLinkedList.deleteTail();
//
//        dLinkedList.display();
//
//        dLinkedList.deleteAt(2);
//
//        dLinkedList.display();
//
//        int foundNodeIndex = dLinkedList.find(200);
//        System.out.println(foundNodeIndex);


//        System.out.println("Circular LinkedList Implementation");
//
//        CLL cLinkedList = new CLL();
//        cLinkedList.insertAtFirst(2);
//        cLinkedList.insertAtFirst(3);
//        cLinkedList.insertAtFirst(15);
//        cLinkedList.insertAtFirst(7);
//        cLinkedList.insertAtFirst(90);
//
//        cLinkedList.display();
//
//        cLinkedList.insertAtEnd(4);
//        cLinkedList.insertAtEnd(5);
//        cLinkedList.insertAtEnd(6);
//
//        cLinkedList.insertAt(4,100);
//        cLinkedList.insertAt(5,200);
//        cLinkedList.insertAt(6,300);
////        linkedList.insertAt(15,3000);
//
//        cLinkedList.display();
//
//        cLinkedList.deleteHead();
//        cLinkedList.deleteHead();
//
//        cLinkedList.deleteTail();
//
//        cLinkedList.display();
//
//        cLinkedList.deleteAt(2);
//
//        cLinkedList.display();
//
//        int foundNodeIndex = cLinkedList.find(200);
//        System.out.println(foundNodeIndex);
    }
}
