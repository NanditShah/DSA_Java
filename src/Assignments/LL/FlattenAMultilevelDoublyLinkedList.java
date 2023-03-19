package Assignments.LL;

public class FlattenAMultilevelDoublyLinkedList {


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

    public static void main(String[] args) {
        System.out.println("Flatten a Multilevel Doubly Linked List");
    }

    private Node flatten_rec(Node head){
        Node curr = head, tail = head;
        while(curr != null){
            Node child = curr.child;
            Node next = curr.next;
            if(child != null){
                Node _tail = flatten_rec(child);
                _tail.next = next;
                if(next != null) next.prev = _tail;
                curr.next = child;
                curr.child = null;
                child.prev = curr;
                curr = _tail;
            }
            else
                curr = next;
            if(curr != null) tail = curr;
        }
        return tail;
    }

    public Node flatten(Node head) {
        if(head != null) flatten_rec(head);
        return head;
    }
}
