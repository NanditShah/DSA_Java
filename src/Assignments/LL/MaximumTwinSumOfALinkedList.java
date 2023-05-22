package Assignments.LL;

public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args) {
        System.out.println("Maximum Twin Sum of a Linked List");
    }

    public int pairSum(ListNode head) {
        ListNode slow = head,fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        int maxSum = 0;
        while(slow != null){
            maxSum = Math.max(maxSum,prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }
        return maxSum;
    }
}
