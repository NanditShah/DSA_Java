package Grind75;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println("Spiral Matrix");
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        List<Integer> list = new ArrayList<>();

        while(left <= right && top <= bottom){
            for(int i = left;i <= right;i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top;i <= bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right;i >= left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if(left <= right){
                for(int i = bottom;i >= top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;

    }
}
