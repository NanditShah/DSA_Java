package LL;

public class LL {
    int size;
    Node head;
    Node tail;

    public LL() {
        this.size = 0;
    }
    public void insertAtFirst(int value){
        Node newHead = new Node(value);
        newHead.next = head;
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
        tail = newTail;
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

    public void insertUsingRec (int index,int value) {
        this.head = insertUsingRec(index,value,this.head);
    }

    public Node insertUsingRec(int index,int value,Node node) {
        if(index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertUsingRec(index-1,value,node.next);
        return node;
    }

    public int deleteHead(){
        int deletedHeadValue = head.val;
        head = head.next;
        size -= 1;
        return deletedHeadValue;
    }

    public int deleteTail(){
        int deletedTailValue = head.val;
        Node nodeBeforeTail = get(size - 1);
        tail = nodeBeforeTail;
        tail.next = null;
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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        int val;
        Node next;

        public Node() {

        }
        public Node(Node next) {
            this.next = next;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

//        Leetcode - 83
        public Node deleteDuplicates(Node head) {
            if(head == null){
                return head;
            }
            Node temp = head;
            while(temp.next != null ){
                if(temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }
                else{
                    temp = temp.next;
                }
            }
            return head;
        }

//        Leetcode - 21
        public Node mergeTwoLists(Node list1, Node list2) {
            Node dummyHead = new Node();
            Node tail = dummyHead;
            while(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                }else{
                    tail.next = list2;
                    list2 = list2.next;
                }
                tail = tail.next;
            }
            tail.next = list1 != null ? list1 : list2;
            return dummyHead.next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
