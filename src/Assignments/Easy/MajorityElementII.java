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
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num == num1){
                count1++;
            }else if(num == num2) {
                count2++;
            }else if(count1 == 0){
                num1 = num;
                count1 = 1;
            }else if(count2 == 0){
                num2 = num;
                count2 = 1;
            }else{
                count1 --;
                count2 --;
            }
        }

        System.out.println(num1);
        System.out.println(num2);

        int num1Count = 0;
        int num2Count = 0;
        int majorityCount = (int) Math.floor(nums.length/3);
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(num == num1){
                num1Count++;
            }
            if(num == num2){
                num2Count++;
            }
        }


        if(num1Count > majorityCount){
            ans.add(num1);
        }
        if(num2Count > majorityCount){
            ans.add(num2);
        }

        return ans;
    }
}
