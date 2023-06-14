package DSASheet.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println("N-Queens");
    }

    public List<List<String>> solveNQueens(int n) {

        boolean[][] board = new boolean[n][n];

        List<List<String>> ans = new ArrayList<>();
        nQueens(board,0,ans);
        return ans;
    }

    private void nQueens(boolean[][] board,int r,List<List<String>> ans){
        if(r == board.length){
            ans.add(prepareList(board));
        }


        for(int j = 0;j<board.length;j++){
            if(isSafe(board,r,j)){
                board[r][j] = true;
                nQueens(board,r+1,ans);
                board[r][j] = false;
            }
        }
    }

    private List<String> prepareList(boolean board[][]){
        int n = board.length;
        List<String> ans= new ArrayList<>();
        for(int i = 0;i<n;i++){
            String s = "";
            for(int j = 0;j<n;j++){
                if(board[i][j]){
                    s += "Q";
                }else{
                    s += ".";
                }
            }
            ans.add(s);
        }
        return ans;
    }

    private boolean isSafe(boolean[][] board,int r,int c){

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
