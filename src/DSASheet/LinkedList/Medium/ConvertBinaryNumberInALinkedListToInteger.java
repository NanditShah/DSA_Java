package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        System.out.println("Convert Binary InALinkedListToInteger");
    }

    public int getDecimalValue(ListNode head) {

        if(head == null) return -1;

        int number = 0;
        int multiplyWith = 1;
        while(head != null){
            number = number*2 + head.val;
            head = head.next;
        }

        return number;
    }
}
