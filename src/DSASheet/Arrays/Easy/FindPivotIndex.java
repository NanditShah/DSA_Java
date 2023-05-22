package DSASheet.Arrays.Easy;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println("Find Pivot Index");

        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        int prefixSum = 0;
        int suffixSum = 0;

        for(int index = 0;index<n;index++){
            suffixSum = totalSum - prefixSum - nums[index];
            if(prefixSum == suffixSum) return index;
            prefixSum += nums[index];
        }
        return -1;
    }


}
