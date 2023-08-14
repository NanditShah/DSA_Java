package DSASheet.LinkedList.Hard;

import DSASheet.LinkedList.ListNode;

public class ReverseNodesInKGroup {
    public static void main(String[] args) {
        System.out.println("Reverse Nodes in k-Group");
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length ++;
            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        int loopsToRun = length / k;
        int i = 0;
        while(i < loopsToRun){
            ListNode leftEnd = prev;
            ListNode newEnd = curr;
            ListNode next = curr.next;
            int j = 0;
            while(curr != null && j < k){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
                j++;
            }
            if(leftEnd != null){
                leftEnd.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;
            prev = newEnd;

            i++;
        }
        return head;
    }
}
