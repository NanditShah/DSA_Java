package Assignments.Easy;

public class RotateImage {
    public static void main(String[] args) {
        System.out.println("Rotate Image");
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0;i<n;i++){
            for(int j = 0;j<i;j++){
                swap(i,j,matrix);
            }
        }

        for(int i =0;i<n;i++){
            reverse(matrix[i]);
        }
    }

    public void swap(int i,int j,int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
