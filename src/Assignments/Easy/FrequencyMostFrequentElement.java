//Not compeleted
package Assignments.Easy;

import java.util.Arrays;

public class FrequencyMostFrequentElement {
    public static void main(String[] args) {
        System.out.println("Frequency of the Most Frequent Element");
        int[] nums = {1,4,8,13};
        int ans = maxFrequency(nums,5);
        System.out.println(ans);
    }

    static int maxFrequency(int[] nums, int k) {
        if(nums.length == 1) {
            return 1;
        }

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int ans = 1;
        while(start < end){
            int mid = start - ((start - end)/2);
            int reqOperations = possibleOperation(findSum(nums,start,mid-1),nums[mid]);
            if(reqOperations <= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return ans;

    }

    static int findSum(int[] num,int start,int end){
        int sum = 0;
        for(int i = start;i<=end;i++){
            sum += num[i];
        }
        return sum;
    }

    static int possibleOperation(int sum,int target){
        return target - sum;
    }

}
