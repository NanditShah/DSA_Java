package Assignments.Easy;

//Not done
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] arr = {-1,-1};
        List<Integer> ans = countSmaller(arr);
        System.out.println(ans.toString());
        System.out.println("Count of Smaller Numbers After Self");
    }

    static List<Integer> countSmaller(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(i != n-1){
                int minCount = findMinCount(Arrays.copyOfRange(nums, i+1, n),nums[i]);
                ans.add(minCount);
            }else{
                ans.add(0);
            }
        }
        return ans;
    }

    static int findMinCount(int[] nums,int upperBound){
        if(nums.length == 1){
            if(nums[0] < upperBound){
                return 1;
            }else{
                return 0;
            }
        }
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start - ((start - end)/2);
            if(nums[mid] >= upperBound){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end+1;
    }
}
