package Grind75;

public class MergeKSortedLists {
    public static void main(String[] args) {
        System.out.println("Merge k Sorted Lists");
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];

        ListNode head1 = lists[0];
        for(int i = 1;i<lists.length;i++){
            ListNode head2 = lists[i];
            head1 = mergeSortedList(head1,head2);
        }
        return head1;
    }

    public ListNode mergeSortedList(ListNode head1,ListNode head2){
        if(head1 == null) return head2;
        if(head2 == null) return head1;

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;

        }
        temp.next = head1 == null ? head2 : head1;

        return dummyNode.next;
    }
}
