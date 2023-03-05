package Assignments.LL;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        System.out.println("Convert Binary Number in a Linked List to Integer");
    }

    public int getDecimalValue(ListNode head) {
        int intValue = 0;
        if(head == null){
            return -1;
        }

        while(head != null){
            intValue = intValue*2 + head.val;
            head = head.next;
        }
        return intValue;
    }
}
