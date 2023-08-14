package DSASheet.BFS.Medium;

import java.util.*;

public class SnakesAndLadders {
    public static void main(String[] args) {
        System.out.println("Snakes and Ladders");

        System.out.println(Arrays.toString(getCoordinates(4,3)));
    }

    class Pair {
        int square;
        int move;

        public Pair(int square, int move) {
            this.square = square;
            this.move = move;
        }
    }

    public int snakesAndLadders(int[][] board) {
        int n = board.length;

        Queue<Pair> helperQueue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        while(!helperQueue.isEmpty()){
            Pair topSquare = helperQueue.remove();

            for(int i = 1;i<=6;i++){
                int nextSquare = topSquare.square + i;
                int[] coordinates = getCoordinates(nextSquare,n);
                if(board[coordinates[0]][coordinates[1]] != -1){
                    nextSquare = board[coordinates[0]][coordinates[1]];
                }
                if(nextSquare == n * n) return topSquare.move + 1;
                if(!visited.contains(nextSquare)){
                    helperQueue.add(new Pair(nextSquare,topSquare.move + 1));
                    visited.add(nextSquare);
                }
            }
        }
        return -1;
    }

    public static int[] getCoordinates(int square,int n){
        int row = n - (((square - 1) / n) + 1);
        int col = n - (((square - 1) % n) + 1);
        if((n % 2 == 0 && row % 2== 1) || (n % 2 == 1 && row % 2 == 0)) col = n - 1 - col;
        return new int[] {row,col};
    }
}
