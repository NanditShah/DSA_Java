package Assignments.LL;

import java.util.Random;

public class LinkedListRandomNode {
    public static void main(String[] args) {
        System.out.println("Linked List Random Node");
    }

}

class Solution {
    private ListNode head;
    private Random rand = new Random();
    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        int ans = -1;
        int i = 1;

        for (ListNode curr = head; curr != null; curr = curr.next, ++i)
            if (rand.nextInt(i) == i - 1)
                ans = curr.val;

        return ans;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}


