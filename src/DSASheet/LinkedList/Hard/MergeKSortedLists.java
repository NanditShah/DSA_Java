package DSASheet.LinkedList.Hard;

import DSASheet.LinkedList.ListNode;

public class MergeKSortedLists {
    public static void main(String[] args) {
        System.out.println("Merge k Sorted Lists");
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0) return null;
        if(n == 1)  return lists[0];

        ListNode result = new ListNode(0);
        result.next = lists[0];

        for(int i = 0;i<n;i++){
            result = mergeTwoLists(result,lists[i]);
        }
        return result.next;
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
        return dummyNode;
    }
}
