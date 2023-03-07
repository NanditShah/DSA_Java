package Assignments.LL;

public class PartitionList {
    public static void main(String[] args) {
        System.out.println("Partition List");
    }

    public ListNode partition(ListNode head, int x) {
        ListNode newLLHead = null;
        ListNode iteratorNode = null;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode newNode = new ListNode(temp.val);
                if(iteratorNode == null){
                    iteratorNode = newNode;
                    newLLHead = iteratorNode;
                }else{
                    iteratorNode.next = newNode;
                    iteratorNode = iteratorNode.next;
                }
            }
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.val >= x){
                ListNode newNode = new ListNode(temp.val);
                if(iteratorNode == null){
                    iteratorNode = newNode;
                    newLLHead = iteratorNode;
                }else{
                    iteratorNode.next = newNode;
                    iteratorNode = iteratorNode.next;
                }
            }
            temp = temp.next;
        }


        return newLLHead;
    }
}
