package DSASheet.LinkedList.Medium;

import DSASheet.LinkedList.ListNode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("Merge Two Sorted Lists");
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;

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
        tail.next = list1 == null ? list2 : list1;
        return dummyNode.next;
    }
    }
