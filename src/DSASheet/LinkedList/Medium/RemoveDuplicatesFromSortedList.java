package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from Sorted List");
    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode temp = head;

        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else temp = temp.next;
        }
        return head;
    }

}
