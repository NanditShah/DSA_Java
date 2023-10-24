package Grind75;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println("Palindrome Linked List");
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode getMiddleNode(ListNode head){
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseLL(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode prev = null,curr = head,next = head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null) return false;
        if(head.next == null) return true;

        int len = 0;

        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }

        ListNode midNode = getMiddleNode(head);
        ListNode secondHead = reverseLL(len % 2 == 0 ? midNode : midNode.next);

        ListNode fistTempHead = head;
        ListNode secondTempHead = secondHead;

        while(fistTempHead != null && secondTempHead != null){
            System.out.println(fistTempHead.val + ',' + secondTempHead.val);
            if(fistTempHead.val != secondTempHead.val) return false;
            fistTempHead = fistTempHead.next;
            secondTempHead = secondTempHead.next;
        }

        reverseLL(secondHead);

        return fistTempHead == null && secondTempHead == null;
    }
}
