package Assignments.LL;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        System.out.println("Odd Even Linked List");
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
