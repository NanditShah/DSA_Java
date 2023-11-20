package Blind75.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        System.out.println("Merge Two Sorted Lists");
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyNode = new ListNode();
        ListNode temp = dummyNode;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        temp.next = list1 == null ? list2 : list1;

        return dummyNode.next;
    }
}
