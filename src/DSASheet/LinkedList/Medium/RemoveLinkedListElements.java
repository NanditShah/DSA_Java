package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        System.out.println("Remove Linked List Elements");
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode prev = dummyNode;
        while(head != null){
            if(head.val == val){
                prev.next = head.next;
            }else{
                prev = head;
            }
            head = head.next;
        }
        return dummyNode.next;
    }
}
