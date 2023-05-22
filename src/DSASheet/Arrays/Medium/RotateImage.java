package DSASheet.Arrays.Medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        System.out.println("Rotate Image");

        rotate(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] backup = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                backup[i][j] = matrix[i][j];
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = backup[j][i];
            }
        }

        for(int i = 0;i<n;i++){
            reverseArr(matrix,i);
        }


        for(int[] nums : matrix){
            System.out.println(Arrays.toString(nums));
        }

    }

    public static void reverseArr(int[][] arr,int row){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[row][start];
            arr[row][start] = arr[row][end];
            arr[row][end] = temp;
            start++;
            end--;
        }
    }
}
