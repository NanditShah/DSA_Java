package Grind75;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println("Middle of the Linked List");
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head,slow = head;

        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
