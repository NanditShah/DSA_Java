package Assignments.LL;

public class InsertionSortList {
    public static void main(String[] args) {
        System.out.println("Insertion Sort List");
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null) {
            if (prev.val <= curr.val) {
                prev = curr;
                curr = curr.next;
                continue;
            }

            ListNode temp = dummy;
            while (curr.val > temp.next.val) {
                temp = temp.next;
            }
            prev.next = curr.next;
            curr.next = temp.next;
            temp.next = curr;
            curr = prev.next;
        }

        return dummy.next;
    }
}
