package Grind75;

public class RotateImage {
    public static void main(String[] args) {
        System.out.println("Rotate Image");
    }

    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] backup = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++)
                backup[i][j] = matrix[i][j];
        }

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++)
                matrix[i][j] = backup[j][i];
        }

        for(int i = 0;i<m;i++){
            reverseArr(matrix[i]);
        }
    }

    public void reverseArr(int[] arr){
        int start = 0,end = arr.length - 1;
        while(start < end){
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
    }
}
