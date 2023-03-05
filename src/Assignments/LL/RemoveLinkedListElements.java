package Assignments.LL;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        System.out.println("Remove Linked List Elements");
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode temp = head;
        while(temp != null && temp.val == val){
            head = temp;
            temp = temp.next;
        }

        ListNode prevNode = null;
        while(temp != null){
            if(temp.val == val){
                prevNode.next = temp.next;
            }else{
                prevNode = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
