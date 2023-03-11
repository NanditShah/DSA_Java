package Assignments.LL;

public class DeleteTheMiddleNodeOfALinkedList {
    public static void main(String[] args) {
        System.out.println("Delete the Middle Node of a Linked List");
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode dummyNode = new ListNode(0,head);
        ListNode prevMid = dummyNode;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prevMid = prevMid.next;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevMid.next = slow.next;
        return head;
    }
}
