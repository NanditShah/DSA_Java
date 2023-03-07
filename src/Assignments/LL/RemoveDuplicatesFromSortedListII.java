package Assignments.LL;

public class RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates fromSortedListII");
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = new ListNode(0,head);
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return temp;
    }
}