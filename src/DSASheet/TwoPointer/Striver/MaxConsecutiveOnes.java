package DSASheet.TwoPointer.Striver;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("Max Consecutive Ones");
        int[] nums = {0,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int i = 0,n = nums.length,ans = 0;
        while(i < n && nums[i] != 1) i++;
        if(i == n - 1) return nums[n - 1];

        int j = i+1;

        while(j < n){
            if(nums[j] == 1){
                j++;
            }else{
                ans = Math.max(ans,(j - i));
                i = j;
                while(i < n && nums[i] != 1 ) i++;
                j = i+1;
            }
            ans = Math.max(ans,(j - i));
        }
        ans = Math.max(ans,(j - i));
        return ans;
    }
}
