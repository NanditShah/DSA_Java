package Assignments.LL;

import java.util.ArrayList;

public class SplitLinkedListInParts {
    public static void main(String[] args) {
        System.out.println("Split Linked List in Parts");
    }

    public int getLength(ListNode head){
        if(head == null){
            return 1;
        }
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        if(head == null){
            ListNode[] ans = {null};
            return ans;
        }

        ListNode[] ans = new ListNode[k];
        ArrayList<ListNode> ansList = new ArrayList<>();
        int length = getLength(head);
        int minimumNodes = length / k;
        int extraNodes = length % k;
        ListNode curr = head;
        ListNode prev = null;
        while(head != null){
            ansList.add(curr);
            for(int i = 0;i<minimumNodes;i++){
                prev = curr;
                curr = curr.next;
            }

            if(extraNodes != 0 && curr != null){
                prev = curr;
                curr = curr.next;
                extraNodes --;
            }

            if(prev != null){
                head = curr;
                prev.next = null;
            }
        }

        while(ansList.size() != k){
            ansList.add(null);
        }
        int i = 0;
        for(ListNode partitionHead : ansList){
            ans[i] = partitionHead;
            i++;
        }
        return ans;
    }
}
