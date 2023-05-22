package DSASheet.Arrays.Medium;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println("Subarray Sum Equals K");
    }

    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumCount = new HashMap<>();

        sumCount.put(0,1);

        int sum = 0;
        int noOfSubArrs = 0;
        for(int num : nums){
            sum += num;
            int diff = k - sum;

            if(sumCount.containsKey(diff)){
                noOfSubArrs += sumCount.get(diff);
            }

            int add = 1;
            if(sumCount.containsKey(sum)){
                add += sumCount.get(sum);
            }
            sumCount.put(sum,add);
        }
        return noOfSubArrs;
    }

}
