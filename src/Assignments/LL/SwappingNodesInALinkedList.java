package Assignments.LL;

public class SwappingNodesInALinkedList {
    public static void main(String[] args) {
        System.out.println("Swapping Nodes in a Linked List");
    }

    public ListNode swapNodes(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        ListNode fast = head;
        ListNode front = head;
        while (k > 1) {
            fast = fast.next;
            front = front.next;
            k--;
        }

        ListNode back = head;
        while (fast.next != null) {
            back = back.next;
            fast = fast.next;
        }

        int val = front.val;
        front.val = back.val;
        back.val = val;

        return head;
    }
}
