package Blind75.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        System.out.println("Set Matrix Zeroes");
    }

    public void setZeroes(int[][] matrix) {

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int row : rows){
            for(int j = 0;j<n;j++) matrix[row][j] = 0;
        }

        for(int col : cols){
            for(int i = 0;i<m;i++) matrix[i][col] = 0;
        }
    }
}
