package Recursion.Backtracking;

public class NKnights {
    public static void main(String[] args) {
        System.out.println("NKnights");
        int n = 4;
        boolean[][] board = new boolean[n][n];
         nKnights(board,0,0,n);

    }

    static void nKnights(boolean[][] board,int row, int col,int knights){
        if(knights == 0){
            printBoard(board);
            System.out.println();
        }
        if(row == board.length - 1 && col == board.length -1 ){
            return;
        }

        if(col == board.length-1){
            nKnights(board, row+1, 0, knights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col] = true;
            nKnights(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        nKnights(board, row, col+1, knights);
    }

    static boolean isSafe(boolean[][] board,int row,int col){
        int n = board.length;

        if(isValid(n,row - 1,col - 2)){
            if(board[row - 1][col - 2]){
                return false;
            }
        }

        if(isValid(n,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        if(isValid(n,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(n,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(int n,int row,int col){
        return (row >= 0 && row < n && col >= 0 && col < n);
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

}


