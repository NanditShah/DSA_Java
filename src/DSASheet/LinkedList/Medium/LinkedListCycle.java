package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        System.out.println("Linked List Cycle");
    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head,fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }
}
