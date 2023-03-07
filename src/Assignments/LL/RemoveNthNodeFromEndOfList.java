package Assignments.LL;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        System.out.println("Remove Nth Node From End of List");
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length ++;

        }

        temp = head;
        int prevNodeIndex = length - n;
        int i = 1;
        if(prevNodeIndex == 0){
            if(head.next != null){
                head = head.next;
                return head;
            }
            else{
                return null;
            }

        }
        while(i < prevNodeIndex){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        return head;
    }
}
