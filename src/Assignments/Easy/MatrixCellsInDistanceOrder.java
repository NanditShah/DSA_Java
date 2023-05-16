package Assignments.Easy;

import java.util.HashMap;

// Not completed
public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        System.out.println("Learning.Matrix Cells in Distance Order");
        int[][] ans = allCellsDistOrder(1,  2,  0,  0);
        System.out.println(ans);
    }

    static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        HashMap<int[], Integer> ans = new HashMap<>();

        int currRow = 0,currCol = 0;
        while(currRow < rows && currCol < cols){
            int[] currPoint = {currRow,currCol};
            int distance = findDistance(currPoint,new int[] {rCenter,cCenter});
            ans.put(currPoint,distance);
            if(currRow == rows - 1){
                currRow = 0;
                currCol ++;
            }else{
                currRow ++;
            }
        }

        return new int[][] {{-1}};
    }

    static int findDistance(int[] x,int[] y){
        return Math.abs(x[0] -x[1]) + Math.abs(y[0] -y[1]);
    }
}
