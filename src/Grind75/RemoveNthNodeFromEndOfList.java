package Grind75;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        System.out.println("Remove Nth Node From End of List");
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        int lenght = 0;

        ListNode curr = head;

        while(curr != null){
            lenght++;
            curr = curr.next;
        }

        int nodeToRemoveFromFront = lenght - n;

        if(nodeToRemoveFromFront == 0) return head.next;

        int i = 1;
        curr = head.next;
        ListNode prev = head;
        while(i < nodeToRemoveFromFront && curr != null){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr != null ? curr.next : null;
        return head;
    }
}
