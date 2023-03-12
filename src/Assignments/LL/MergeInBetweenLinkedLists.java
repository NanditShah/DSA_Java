package Assignments.LL;

public class MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        System.out.println("Merge In Between Linked Lists");
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = null;
        ListNode temp = list1;
        ListNode prevStart = null;
        ListNode afterEnd = null;
        ListNode list2End = list2;
        int i = 0;
        while(temp != null){
            if(a == i){
                prev.next = null;
                prevStart = prev;
            }
            if(b == i){
                prev.next = null;
                afterEnd = temp.next;
                // break;
            }
            i++;
            prev = temp;
            temp = temp.next;
        }
        prevStart.next = null;

        while(list2End.next != null){
            list2End = list2End.next;
        }

        prevStart.next = list2;
        list2End.next = afterEnd;

        return list1;
    }
}
