package Assignments.LL;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Linked Lists");
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null){
            while(tempB != null){
                if(tempA == tempB){
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA  = tempA.next;
            tempB = headB;
        }

        return null;
    }
}
