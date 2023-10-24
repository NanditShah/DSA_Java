package Grind75;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        System.out.println("Sort Colors");
        int[] colors = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(colors));
        sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }


    public static void sortColors(int[] nums) {
        int  n = nums.length;
        int i = 0;
        while(i < n - 1){
            int j = i + 1;
            int minElement = nums[j],minElementIndex = j;
            while(j < n){
                if(nums[j] < minElement){
                    minElement = nums[j];
                    minElementIndex = j;
                }
                j++;
            }
            if(nums[i] > minElement){
                nums[minElementIndex] = nums[i];
                nums[i] = minElement;
            }
            i++;
        }
    }
}
