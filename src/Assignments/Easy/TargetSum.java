package Assignments.Easy;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println("Target Sum");
        int[] nums = {1,1,1,1,1};
        int ans = findTargetSumWays(nums,3);
        System.out.println(ans);
    }

    static int findTargetSumWays(int[] nums, int target) {
        int[] processed = new int[nums.length];
        int count = findTarget(processed,nums,0,target);
        return count;
    }
    static int findTarget(int[] processed,int[] unProcessed,int index,int target){
//        Base cases
        if(index == unProcessed.length){
            if(sum(processed) == target){
                return 1;
            }else{
                return 0;
            }
        }
        int count = 0;
        processed[index] = unProcessed[index];
        count += findTarget(processed,unProcessed,index+1,target);
        processed[index] = unProcessed[index] * -1;
        count += findTarget(processed,unProcessed,index+1,target);

        return count;
    }

    static int sum(int[] processed){
        int sum = 0;
        for(int num : processed){
            sum += num;
        }
        return sum;
    }
}
