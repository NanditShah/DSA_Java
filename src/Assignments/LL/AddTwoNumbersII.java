package Assignments.LL;

public class AddTwoNumbersII {
    public static void main(String[] args) {
        System.out.println("Add Two Numbers II");
    }

    public ListNode reverseLL(ListNode head){

        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        ListNode nextNode = currNode.next;

        while (currNode != null){
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next;
            }
        }
        return prevNode;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverseLL(l1);
        ListNode rl2 = reverseLL(l2);


        int remainder = 0;
        ListNode head = null;
        ListNode temp = null;
        while(rl1 != null && rl2 != null){
            int sum = rl1.val + rl2.val + remainder;
            int val = sum;
            if(sum > 9){
                val = sum % 10;
                remainder = sum / 10;
            }else{
                remainder = 0;
            }
            if(head == null){
                head = new ListNode(val);
                temp = head;
            }else{
                temp.next = new ListNode(val);
                temp = temp.next;
            }
            rl1 = rl1.next;
            rl2 = rl2.next;
        }

        while(rl1 != null){
            int sum = rl1.val + remainder;
            int val = sum;
            if(sum > 9){
                val = sum % 10;
                remainder = sum / 10;
            }else{
                remainder = 0;
            }
            temp.next = new ListNode(val);
            rl1 = rl1.next;
            temp = temp.next;
        }

        while(rl2 != null){
            int sum = rl2.val + remainder;
            int val = sum;
            if(sum > 9){
                val = sum % 10;
                remainder = sum / 10;
            }else{
                remainder = 0;
            }
            temp.next = new ListNode(val);
            rl2 = rl2.next;
            temp = temp.next;
        }

        if(remainder > 0){
            temp.next = new ListNode(remainder);
        }
        ListNode rHead = reverseLL(head);
        return rHead;

    }
}
