package DSASheet.BinarySearch.Hard;

import java.util.TreeSet;

public class MaxSumOfRectangleNoLargerThanK {
    public static void main(String[] args) {
        System.out.println("Max Sum of Rectangle No Larger Than K");
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
            int result = Integer.MIN_VALUE;
            for(int left =0 ;left<matrix[0].length; left++){
                int[] rSum = new int[matrix.length];
                for(int right = left;right<matrix[0].length;right++){
                    for(int row=0; row < matrix.length; row++)
                        rSum[row] += matrix[row][right];
                    TreeSet<Integer> set = new TreeSet<>();
                    set.add(0);
                    int cs = 0;
                    for(int a: rSum){
                        cs += a;
                        Integer target = set.ceiling(cs-k);
                        if(target !=null)
                            result = Math.max(result,cs-target);
                        set.add(cs);
                    }
                }
            }
            return result;
    }
}
