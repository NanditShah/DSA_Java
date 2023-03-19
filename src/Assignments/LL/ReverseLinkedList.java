package Assignments.LL;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }
}
