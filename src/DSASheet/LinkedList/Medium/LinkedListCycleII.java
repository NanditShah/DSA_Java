package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class LinkedListCycleII {
    public static void main(String[] args) {
        System.out.println("Linked List Cycle II");
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;

        boolean foundCycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                foundCycle = true;
                break;
            }
        }

        if(!foundCycle) return null;

        ListNode f = head;

        while(f != slow){
            f = f.next;
            slow = slow.next;
        }

        return f;
    }
}
