// Continue from here
package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        System.out.println("4Sum");
        int[] nums = {2,2,2,2,2};
        List<List<Integer>> ans = fourSum(nums,8);
        for(List<Integer> a : ans){
            System.out.println(Arrays.toString(a.toArray()));
        }
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        // Length of the array
        int n = nums.length;

        // Resultant list
        List<List<Integer>> quadruplets = new ArrayList<>();

        for (int h = 0; h < n-3; h++){
            for (int i = h+1; i < n-2; i++) {

                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                // Left and right pointers
                int j = i + 1;
                int k = n - 1;
                // Loop for all the remaining pairs
                while (j < k) {
                    if (nums[h] + nums[i] + nums[j] + nums[k] == target) {
                        quadruplets.add(Arrays.asList(nums[h], nums[i], nums[j], nums[k]));
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                    } else if (nums[h]+nums[i] + nums[j] + nums[k] < target) {
                        j++;
                    } else {
                        k--;
                    }
                }

            }
        }
        // Loop for each element of the array

        return quadruplets;
    }
}
