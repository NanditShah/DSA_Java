package Assignments.Easy;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        System.out.println("Special Array With X Elements Greater Than or Equal X");
        int[] nums = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100
                ,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,
                100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100
                ,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        int ans = specialArray(nums);
        System.out.println(ans);
    }

    static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxEle = nums[n - 1];

        int ans = -1;
        for(int i = 1;i<=maxEle;i++){
         int greaterEleCount = greaterThenEleCount(nums,i);
            
         if(greaterEleCount == i){
             ans = i;
             break;
         }
        }
        return ans;
    }

    static int greaterThenEleCount(int[] nums,int ele){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= ele){
                return nums.length - i;
            }
        }
        return 0;
    }

}
