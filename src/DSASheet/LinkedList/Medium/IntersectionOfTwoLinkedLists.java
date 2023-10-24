package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Linked Lists");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA,l2 = headB;

        while(l1 != l2){
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }

        return l1;
    }
}
