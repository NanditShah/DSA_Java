package Learning.Matrix;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        System.out.println("Row Col Learning.Matrix");

        int[][] matrix = {{1,5,10},{2,6,11},{3,7,13}};
        int[] ans = search(matrix,13);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c >= 0){
            if(target == matrix[r][c]){
                return new int[] {r,c};
            }
            else if(target < matrix[r][c]){
                c --;
            }else{
                r++;
            }
        }

        return new int[] {-1,-1};
    }

}
