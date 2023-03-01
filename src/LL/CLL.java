package LL;

public class CLL {
    int size;
   Node head;
   Node tail;

    public CLL() {
        this.size = size;
    }

    public void insertAtFirst(int value){
       Node newHead = new Node(value);
        newHead.next = head;
        if(tail == null){
            tail = newHead;
        }else{
            tail.next = newHead;
        }
        head = newHead;
        size += 1;
    }

    public void insertAtEnd(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }
       Node newTail = new Node(value);
        tail.next = newTail;
        tail = newTail;
        newTail.next = head;
        size += 1;
    }

    public void insertAt(int index,int value) {
//        if(index > size - 1){
//            throw new Exception("Index is greater than size of linked list");
//        }
        if(tail == null){
            insertAtFirst(value);
            return;
        }
       Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
       Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        size += 1;
    }

    public int deleteHead(){
        int deletedHeadValue = head.val;
        head = head.next;
        tail = head;
        size -= 1;
        return deletedHeadValue;
    }

    public int deleteTail(){
        int deletedTailValue = head.val;
       Node nodeBeforeTail = get(size - 1);
        tail = nodeBeforeTail;
        tail.next = head;
        size -= 1;
        return deletedTailValue;
    }

    public int deleteAt(int index){
       Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        int deletedNodeValue = temp.next.val;
        temp.next = temp.next.next;
        size -= 1;
        return deletedNodeValue;
    }

    public Node get(int index){
       Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public int find(int val){
       Node temp = head;
        int index = 0;
        while(temp.val != val){
            temp = temp.next;
            index += 1;
        }
        return index;
    }
    public void display(){
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            do{
                //Prints each node by incrementing pointer.
                System.out.print(current.val + " -> ");
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    private class Node {
        int val;
       Node next;

        public Node(Node next) {
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }
}
