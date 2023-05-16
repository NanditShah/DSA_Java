package Assignments.Easy;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.println("Learning.Matrix Diagonal Sum");

        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;

        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += mat[i][i];
        }

        for(int i = 0;i<n;i++){
            int row = i;
            int col = n - (row + 1);
            if(row != col){
                sum += mat[row][col];
            }
        }
        return sum;
    }
}
