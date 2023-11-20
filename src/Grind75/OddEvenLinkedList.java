package Grind75;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        System.out.println("Odd Even Linked List");
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


    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode even = evenHead;

        for (boolean isOdd = true; head != null; head = head.next, isOdd = !isOdd){
            if (isOdd) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
        }


        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;

    }
}