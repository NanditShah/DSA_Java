package Grind75;

public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        System.out.println("Add Two Numbers");
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode head = null;
        ListNode temp = null;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + remainder;
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
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + remainder;
            int val = sum;
            if(sum > 9){
                val = sum % 10;
                remainder = sum / 10;
            }else{
                remainder = 0;
            }
            temp.next = new ListNode(val);
            l1 = l1.next;
            temp = temp.next;
        }

        while(l2 != null){
            int sum = l2.val + remainder;
            int val = sum;
            if(sum > 9){
                val = sum % 10;
                remainder = sum / 10;
            }else{
                remainder = 0;
            }
            temp.next = new ListNode(val);
            l2 = l2.next;
            temp = temp.next;
        }

        if(remainder > 0){
            temp.next = new ListNode(remainder);
        }
        return head;
    }
}
