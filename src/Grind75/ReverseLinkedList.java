package Grind75;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        System.out.println("Reverse Linked List");
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null, next = head.next;

        while(head != null){
            head.next = prev;
            prev = head;
            head = next;
            if(next != null) next = next.next;
        }
        return prev;
    }
}
