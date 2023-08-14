package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Reverse Linked List");
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = next.next;
        }

        return prev;
    }
}
