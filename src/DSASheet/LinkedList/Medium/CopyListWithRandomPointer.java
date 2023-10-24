package DSASheet.LinkedList.Medium;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        System.out.println("Copy List with Random Pointer");
    }

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> oldToCopyMap = new HashMap<>();

        oldToCopyMap.put(null,null);

        Node temp = head;
        while(temp != null){
            Node copy = new Node(temp.val);
            oldToCopyMap.put(temp,copy);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            Node copy = oldToCopyMap.get(temp);
            copy.next = oldToCopyMap.get(temp.next);
            temp.random = oldToCopyMap.get(temp.random);
            temp = temp.next;
        }

        return oldToCopyMap.get(head);
    }
}
