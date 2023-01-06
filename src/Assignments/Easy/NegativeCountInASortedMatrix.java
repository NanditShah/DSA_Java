package Assignments.Easy;

import java.util.Arrays;

public class NegativeCountInASortedMatrix {
    public static void main(String[] args) {
        System.out.println("Count Negative Numbers in a Sorted Matrix");
        int[][] matrix = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
        int ans = countNegatives(matrix);
        System.out.println(ans);
    }

    static int countNegatives(int[][] grid){
        int n=grid.length,m=grid[0].length, row=0, column=m - 1,ans=0;
        while (row < n) {
            while (column >= 0 && grid[row][column] < 0) column--;
            ans += m - column - 1;
            row++;
        }
        return ans;
    }
}
