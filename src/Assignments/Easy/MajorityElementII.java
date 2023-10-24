package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        System.out.println("Majority II");
        List<Integer> ans = majorityElement(new int[] {1,2});
        System.out.println(ans);
    }

    public static List<Integer> majorityElement(int[] nums) {
       int num1 = -1, num2 = -1, count1 = 0, count2 = 0;

       for(int num : nums){
           if(num == num1) count1++;
           else if(num == num2) count2++;
           else if(count1 == 0){
               count1++;
               num1 = num;
           } else if(count2 == 0){
               count2++;
               num2 = num;
           }
       }

       int num1Count = 0, num2Count = 0;

       for(int num : nums){
           if(num == num1) num1Count++;
           else if(num == num2) num2Count++;
       }
       int requiredMajorityCount = nums.length / 3;
       List<Integer> ans = new ArrayList<>();

       if(num1Count >= requiredMajorityCount) ans.add(num1);
       if(num2Count >= requiredMajorityCount) ans.add(num2);

       return ans;
    }
}
