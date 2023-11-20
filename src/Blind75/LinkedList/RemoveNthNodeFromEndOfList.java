package Blind75.LinkedList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        System.out.println("Remove Nth Node From End of List");
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;

        int length = 1;
        ListNode temp = head;
        while(head != null){
            length++;
            head = head.next;
        }

        int nodeToRemoveFromFront = length - n + 1;
        if(nodeToRemoveFromFront == 1) {
            head = head.next;
        }else{
            ListNode prev = null;
            ListNode curr = head;
            int i = 1;
            while(curr != null){
                if(i == nodeToRemoveFromFront){
                    prev.next = curr.next;
                }
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
