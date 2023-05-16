package Learning.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        System.out.println("Find All Duplicates in an Array");
        int[] arr= {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans.toString());
    }

    static List<Integer> findDuplicates(int[] nums) {
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
                ans.add(nums[j]);
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
