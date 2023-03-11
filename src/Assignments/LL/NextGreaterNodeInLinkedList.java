package Assignments.LL;

import java.util.ArrayList;

public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {
        System.out.println("Next Greater Node In Linked List");
    }

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head.next;
        ListNode traverseNode = head.next;
        int nextGreatVal = 0;
        while(temp != null){
            if(arr.size() == 0 && temp.val <= nextGreatVal){
                traverseNode = temp;
                int comparingVal = temp.val;
                int maxVal = temp.val;
                while(traverseNode != null){
                    if(traverseNode.val > maxVal){
                        maxVal = traverseNode.val;
                    }
                    traverseNode = traverseNode.next;
                }
                if(comparingVal == maxVal){
                    nextGreatVal = 0;
                }else{
                    nextGreatVal = maxVal;
                }
            }
            arr.add(nextGreatVal);
            temp = temp.next;
        }
        System.out.println(arr);
        int[] ansArr = new int[arr.size()];
        int i =0;
        for(int val : arr){
            ansArr[i] = val;
            i++;
        }
        return ansArr;
    }
}
