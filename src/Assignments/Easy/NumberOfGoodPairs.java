package Assignments.Easy;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println("Number of Good Pairs");
        int[] nums = {1,1,1,1};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int ans = 0;
        while(i < n - 1){
            while(j<n){
                if(nums[i] == nums[j] && i < j){
                    ans ++;
                }
                j++;
            }
            i++;
            j = i+1;
        }
        return ans;
    }
}

