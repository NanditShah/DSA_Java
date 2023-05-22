package DSASheet.Arrays.Medium;

import java.util.Arrays;
import java.util.Map;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println("3Sum Closest");

        System.out.println(threeSumClosest(new int[] {0,0,0},1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i =0;i<n - 2;i++){
            int j = i+1;
            int k = n - 1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target - sum) < diff){
                    diff = Math.abs(target - sum);
                    ans = sum;
                }
                if(target < sum){
                    k --;
                }else{
                    j ++;
                }
            }
        }
        return ans;
    }
}
