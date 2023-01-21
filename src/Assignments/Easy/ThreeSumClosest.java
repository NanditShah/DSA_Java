package Assignments.Easy;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int ans = threeSumClosest(new int[] {-1,2,1,-4},1);
        System.out.println(ans);
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i<n-2;i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
                if(Math.abs(sum - target) <diff){
                    diff = Math.abs(sum - target);
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
