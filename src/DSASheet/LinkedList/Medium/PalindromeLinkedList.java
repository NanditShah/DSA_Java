package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println("Palindrome Linked List");
    }

    public ListNode getMiddleNode(ListNode head){
        ListNode fast = head,slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
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

        ListNode midPoint = getMiddleNode(head);

        ListNode secondHead = reverseLL(midPoint);
        ListNode tempSecondHead = secondHead;

        while(head != null && secondHead != null){
            System.out.println(head.val);
            System.out.println(secondHead.val);
            if(head.val != secondHead.val) break;
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseLL(tempSecondHead);
        return head == null || secondHead == null;
    }
}
