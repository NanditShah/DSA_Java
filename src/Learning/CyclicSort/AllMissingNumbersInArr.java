package Learning.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbersInArr {
    public static void main(String[] args) {
        System.out.println("Find All Numbers Disappeared in an Array");
        int[] arr = {1,1};
        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans.toString());
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i =0;

        List<Integer> ans = new ArrayList<>();
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int j = 0;j<n;j++){
            if((j+1) != nums[j]){
                ans.add(j+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int from,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

}
