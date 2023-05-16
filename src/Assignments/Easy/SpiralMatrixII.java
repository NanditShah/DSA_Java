package Assignments.Easy;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        System.out.println("Spiral Learning.Matrix II");

        int[][] ans = generateMatrix(3);

        for(int[] arr : ans){
            System.out.print(Arrays.toString(arr));
            System.out.print(",");
        }
    }

    public static int[][] generateMatrix(int n) {

        int[][] ansArr = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;

        int counter = 1;

        while(left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ansArr[top][i] = counter;
                counter++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ansArr[i][right] = counter;
                counter++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ansArr[bottom][i] = counter;
                    counter++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ansArr[i][left] = counter;
                    counter++;
                }
                left++;
            }
        }

        return ansArr;
    }
}
