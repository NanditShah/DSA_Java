package Assignments.LL;

public class SwappingNodesInALinkedList {
    public static void main(String[] args) {
        System.out.println("Swapping Nodes in a Linked List");
    }

    public ListNode swapNodes(ListNode head, int k) {
        if(head == null){
            return head;
        }

        ListNode front = head;
        ListNode back = head;
        ListNode pointer = head;

        while(k > 1){
            front = front.next;
            pointer = pointer.next;
            k--;
        }

        while(pointer.next != null){
            back = back.next;
            pointer = pointer.next;
        }

        int tempVal = back.val;
        back.val = front.val;
        front.val = tempVal;

        return head;
    }

}
