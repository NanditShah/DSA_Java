package Grind75;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        System.out.println("Swap Nodes in Pairs");
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


    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummyNode  = new ListNode();
        dummyNode.next = head;


        ListNode prev = dummyNode;

        while(head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
//            if(head.next != null){
//                head = head.next.next;
//            }
        }
        return dummyNode.next;
    }
}
