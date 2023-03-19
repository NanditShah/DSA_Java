package Assignments.LL;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        System.out.println("Reverse Linked List II");
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;

        int i = 1;
        while(i < left && pres != null){
            prev = pres;
            pres = pres.next;
            i++;
        }

        ListNode next = pres.next;
        ListNode leftEnd = prev;
        ListNode newEnd = pres;

        while(pres != null && i < right){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
            i++;
        }
        if(leftEnd != null){
            leftEnd.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = pres;

        return head;
    }
}
