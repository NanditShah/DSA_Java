package DSASheet.Stack.Easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        System.out.println("Next Greater Element I");
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int val : nums2){
            while(!stk.isEmpty() && stk.peek() < val){
                hMap.put(stk.pop(),val);
            }
            stk.push(val);
        }
        while(!stk.isEmpty()){
            hMap.put(stk.pop(),-1);
        }

        for(int  i =0;i<nums2.length;i++){
            ans[i] = hMap.get(nums1[i]);
        }
        return ans;
    }
}
