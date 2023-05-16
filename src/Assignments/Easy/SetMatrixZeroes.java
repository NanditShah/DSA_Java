package Assignments.Easy;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        System.out.println("Set Learning.Matrix Zeroes");


        int[][] testCase = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(testCase);

        for(int[] arr : testCase){
            System.out.print(Arrays.toString(arr));
            System.out.println(",");
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] copyMatrix = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                copyMatrix[i][j] = matrix[i][j];
            }
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++) {
                if(copyMatrix[i][j] == 0){
                    int left = i;
                    int right = i;
                    int top = j;
                    int bottom = j;
                    while(left >= 0){
                        matrix[left][j] = 0;
                        left --;
                    }
                    while(right < m){
                        matrix[right][j] = 0;
                        right++;
                    }
                    while(top >= 0){
                        matrix[i][top] = 0;
                        top --;
                    }
                    while(bottom < n){
                        matrix[i][bottom] = 0;
                        bottom++;
                    }
                }
            }
        }
    }
}
