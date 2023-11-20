package Blind75.Matrix;

public class RotateImage {
    public static void main(String[] args) {
        System.out.println("Rotate Image");
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int[][] copyMatrix = new int[n][n];

        for(int i = 0;i<n;i++)
            System.arraycopy(matrix[i],0,copyMatrix[i],0,n);

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++)
                matrix[i][j] = copyMatrix[j][i];
        }

        for(int i = 0;i<n;i++){
            matrix[i] = reverseArr(matrix[i]);
        }
    }

    public int[] reverseArr(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
