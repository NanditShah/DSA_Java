package Blind75.LinkedList;

public class ReorderList {
    public static void main(String[] args) {
        System.out.println("Reorder List");
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode fast = head,slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedHead = reverseList(slow);

        ListNode startHead = head;
        ListNode dummyNode = new ListNode();
        ListNode curr = dummyNode;
        while(startHead != null && reversedHead != null){
            curr.next = startHead;
            curr = curr.next;
            curr.next = reversedHead;
            curr = curr.next;
            startHead = startHead.next;
            reversedHead = reversedHead.next;
        }

        curr.next = startHead == null ? reversedHead : startHead;

        head = dummyNode.next;
    }
}
