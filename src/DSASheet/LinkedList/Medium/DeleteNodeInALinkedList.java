package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        System.out.println("Delete Node in a Linked List");
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
