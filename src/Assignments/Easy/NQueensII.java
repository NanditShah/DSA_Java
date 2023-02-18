package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class NQueensII {
    public static void main(String[] args) {
        System.out.println("N-Queens II");
        System.out.println(totalNQueens(4));
    }


    static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];

        int count = nQueens(board,0);
        return count;
    }
    static int nQueens(boolean[][] board,int r){
        if(r == board.length){
            return 1;
        }

        int count = 0;

        for(int j = 0;j<board.length;j++){
            if(isSafe(board,r,j)){
                board[r][j] = true;
                count += nQueens(board,r+1);
                board[r][j] = false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board,int r,int c){

//        Checking vertically
        for(int i = 0;i < r;i++){
            if(board[i][c]){
                return false;
            }
        }

        int leftMin = Math.min(r,c);
        for(int i = 1;i<=leftMin;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }

        int rightMin = Math.min(r,board.length - 1- c);
        for(int i = 1;i<=rightMin;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }

        return true;
    }
}
