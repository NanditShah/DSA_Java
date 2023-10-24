package Grind75;

public class SortList {
    public static void main(String[] args) {
        System.out.println("Sort List");
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode divideList(ListNode head){
        ListNode fast = head, slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode head1,ListNode head2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode.next;
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

        temp.next = head1 != null ? head1 : head2;
        return dummyNode.next;
    }


    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode mid = divideList(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeList(left,right);
    }

}
