package LL;

import java.util.ArrayList;

public class Leetcode {

//  141
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

//  142
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    //  Leetcode - 21
    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 != null ? list1 : list2;
        return dummyHead.next;
    }

//  876
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

//    148
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = middleNode(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return mergeTwoLists(left,right);

    }


//    206
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prevNode = null;
        ListNode presentNode = head;
        ListNode nextNode = presentNode.next;

        while (presentNode != null) {
            presentNode.next = prevNode;
            prevNode = presentNode;
            presentNode = nextNode;
            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }

        return prevNode;
    }

//    92
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }


//    234
//    public boolean isPalindrome(ListNode head) {
//        ListNode midNode = middleNode(head);
//        ListNode newHead = reverseList(midNode);
//        ListNode tempNewHead = newHead;
//
//        while(head != null && newHead != null){
//            if(head.val != newHead.val){
//                break;
//            }
//            head = head.next;
//            newHead = newHead.next;
//        }
//        reverseList(tempNewHead);
//        return head == null || newHead == null;
//    }

//    Other approach
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next == null){
            return true;
        }
        ArrayList<Integer> llArr = new ArrayList<>();
        ListNode tempHead = head;
        while(tempHead != null){
            llArr.add(tempHead.val);
            tempHead = tempHead.next;
        }

        int start = 0;
        int end = llArr.size() - 1;
        while(start <= end){
            if(llArr.get(start) != llArr.get(end)){
                return false;
            }
        }
        return true;
    }

  class ListNode {
      int val;
      ListNode next;

      ListNode() {}
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
