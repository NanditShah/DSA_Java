package LL;

public class DLL {
    int size;
    Node head;
    Node tail;

    public DLL() {
        this.size = size;
    }

    public void insertAtFirst(int value){
        Node newHead = new Node(value);
        if(head != null){
            newHead.next = head;
            head.prev = newHead;
        }
        if(tail == null){
            tail = newHead;
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
        newTail.prev = tail;
        tail = newTail;
        size += 1;
    }

    public void insertAt(int index,int value) {
//        if(index > size - 1){
//            throw new Exception("Index is greater than size of linked list");
//        }
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        Node temp = head;
        for(int i =0;i<index-1;i++){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        size += 1;
    }

    public int deleteHead(){
        int deletedHeadValue = head.val;
        head = head.next;
        head.prev = null;
        size -= 1;
        return deletedHeadValue;
    }

    public int deleteTail(){
        int deletedTailValue = head.val;
        tail = tail.prev;
        tail.next = null;
        size -= 1;
        return deletedTailValue;
    }

    public int deleteAt(int index){
        Node nodeTobeDeleted = head;
        for(int i =0;i<index;i++){
            nodeTobeDeleted = nodeTobeDeleted.next;
        }
        int deletedNodeValue = nodeTobeDeleted.val;
        nodeTobeDeleted.prev.next = nodeTobeDeleted.next;
        nodeTobeDeleted.next.prev = nodeTobeDeleted.prev;
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");


        System.out.println("In Reverse");
        temp = tail;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
        System.out.println("START");
        System.out.println();
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(Node next) {
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }
}
