package DSASheet.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        System.out.println("Find All Duplicates in an Array");
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(i,correctIndex,nums);
            }else{
                i++;
            }
        }

        for(int j = 0;j<nums.length;j++){
            if(j+1 != nums[j]){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    private void swap(int i, int correctIndex, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
