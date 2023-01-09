package Assignments.Easy;

public class SearchMatrix {
    public static void main(String[] args) {
        System.out.println("Search Matrix");
        boolean ans = searchMatrix(new int[][] {{1,3}},3);
        System.out.println(ans);
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0){
            System.out.println(r+" "+c);
            if(target == matrix[r][c]){
                return true;
            }
            else if(target < matrix[r][c]){
                c --;
            }else{
                r++;
            }
        }

        return false;
    }
}
