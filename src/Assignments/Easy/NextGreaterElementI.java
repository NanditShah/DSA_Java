package Assignments.Easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        System.out.println("Next Greater Element I");

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        nextGreaterElement(nums1,nums2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> nge = new HashMap<>();


        for(int val : nums2){
            while(!stack.isEmpty() && val > stack.peek()){
                nge.put(stack.pop(),val);
            }
            stack.push(val);
        }

        while(!stack.isEmpty()){
            nge.put(stack.pop(),-1);
        }

        int[] ans = new int[nums1.length];

        int i = 0;
        for(int key : nums1){
            ans[i] = nge.get(key);
            i++;
        }

        return ans;
    }
}
