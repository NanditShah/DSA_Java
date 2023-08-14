package DSASheet.BinarySearch.Medium;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        System.out.println(" Search a 2D Matrix");
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target) return true;
            else if(target < matrix[r][c]) c --;
            else r++;
        }
        return false;
    }
}
