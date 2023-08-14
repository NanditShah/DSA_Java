package DSASheet.BinarySearch.Hard;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        System.out.println("Split Array Largest Sum");
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;

        for(int num : nums){
            start = Math.max(start,num);
            end += num;
        }
        int res = end;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(canDivide(mid,nums,k)) {
                res = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return res;
    }

    public static boolean canDivide(int largest, int[] nums, int k){
        int numSubArrays = 1;
        int currSum = 0;
        for(int num : nums){
            currSum += num;
            if(currSum > largest){
                numSubArrays+=1;
                currSum = num;
            }
        }
        return numSubArrays <= k;
    }
}
