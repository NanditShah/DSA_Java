package DSASheet.SlidingWindow;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        System.out.println("Max Consecutive Ones III");
    }

    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, countZeros = 0, ans = Integer.MIN_VALUE, n = nums.length;

        while(j < n){
            if(nums[j] == 0) countZeros ++;
            while(countZeros > k){
                if(nums[i] == 0) countZeros --;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
