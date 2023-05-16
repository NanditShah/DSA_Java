package Learning.Recursion.Backtracking;

public class NQueens {
    public static void main(String[] args) {
        System.out.println("N-Queens");
        int n = 5;
        boolean[][] board = new boolean[n][n];
        int count = nQueens(board,0);
        System.out.println(count);
    }

    static int nQueens(boolean[][] board,int row){
        if(row == board.length){
            printBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0;col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += nQueens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static void printBoard(boolean[][] board){
        for(boolean[] row:board){
            for(boolean cell : row){
                if(cell){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board,int row,int col){
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        int leftMin = Math.min(row,col);
        for(int i = 1;i<=leftMin;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int RightMin = Math.min(row,(board.length - 1) - col);
        for(int i = 1;i<=RightMin;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
}
