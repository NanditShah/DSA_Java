package CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        System.out.println("Set Mismatch");
        int[] arr = {8,7,3,5,3,6,1,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findErrorNums(int[] nums) {

        int i = 0;
        while(i <  nums.length){
            int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int j = 0;j < nums.length;j++){
            if(j+1 != nums[j]){
                return new int[] {nums[j],j+1};
            }
        }
        return  new int[]{nums.length,nums.length};
    }

    static void swap(int[] arr,int from,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
