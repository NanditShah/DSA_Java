package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        System.out.println("Middle of the Linked List");
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
