package Assignments.Easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.out.println("Shuffle the Array");
        int[] shuffledArr = shuffle(new int[]{2,5,1,3,4,7},3);
        System.out.println(Arrays.toString(shuffledArr));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ansArr = new int[2*n];
        for (int i = 0; i < 2 * n; i++)
            ansArr[i] = (i & 1) == 1 ? nums[n + i / 2] : nums[i / 2];
        return ansArr;
    }

}
