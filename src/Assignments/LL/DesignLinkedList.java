package Assignments.LL;

public class DesignLinkedList {
    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
//        ll.addAtHead(1);
//        ll.addAtTail(3);
//        ll.addAtIndex(1,2);
//        ll.traverse();
//        ll.get(1);
//        ll.deleteAtIndex(0);
//        ll.traverse();
//        ll.get(1);

        ll.addAtHead(2);
        ll.deleteAtIndex(1);
        ll.addAtHead(2);
        ll.addAtHead(7);
        ll.addAtHead(3);
        ll.addAtHead(2);
        ll.addAtHead(5);
        ll.addAtTail(5);
        ll.traverse();
        ll.get(5);
        ll.deleteAtIndex(6);
        ll.traverse();
        ll.deleteAtIndex(4);
        ll.traverse();
    }
}

class MyLinkedList {

    int length = 0;
    ListNode dummy = new ListNode(0);

    public MyLinkedList() {
    }

    public int get(int index) {
        if(index < 0 || index > length - 1){
            return -1;
        }
        ListNode temp = dummy.next;
        int i = 0;
        while(i != index){
            i++;
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        ListNode head = new ListNode(val);
        head.next = dummy.next;
        dummy.next = head;
        length++;
    }

    public void addAtTail(int val) {
        ListNode temp = dummy.next;
        if(temp == null){
            addAtHead(val);
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new ListNode(val);
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if(index >= 0 && index <= length){
            if(index == 0){
                addAtHead(val);
            }else if(index == length){
                addAtTail(val);
            }else{
                int i = 0;
                ListNode temp = dummy.next;
                while(i != index - 1){
                    i++;
                    temp = temp.next;
                }
                ListNode prevNode = temp;
                ListNode newNode = new ListNode(val);
                newNode.next = prevNode.next;
                prevNode.next = newNode;
                length ++;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if(index >= 0 && index < length){
            if(index == 0){
                dummy.next = dummy.next.next;
                length --;
            }else{
                int i = 0;
                ListNode temp = dummy.next;
                while(i != index - 1){
                    temp = temp.next;
                    i++;
                }
                ListNode prevNode = temp;
                prevNode.next = prevNode.next.next;
                length --;
            }
        }
    }

    public void traverse(){
        ListNode temp = dummy.next;
        while(temp != null){
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
