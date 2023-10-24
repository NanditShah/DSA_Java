package Grind75;

import java.util.LinkedList;
import java.util.Queue;

public class ZeoOneMatrix {
    public static void main(String[] args) {
        System.out.println("01 Matrix");
    }

    class Node{
        int x,y,d;

        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length,n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] ans = new int[m][n];
        Queue<Node> helperQueue = new LinkedList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                    helperQueue.add(new Node(i,j,0));
                    visited[i][j] = true;
                }
            }
        }

        while(!helperQueue.isEmpty()){
            Node topNode = helperQueue.remove();
            int x = topNode.x, y = topNode.y, d = topNode.d;
            ans[x][y] = d;
            for(int[] dir : dirs){
                int newX = x + dir[0];
                int newY = y + dir[1];

                if(newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY]){
                    helperQueue.add(new Node(newX,newY,d+1));
                    visited[newX][newY] = true;
                }
            }
        }

        return ans;
    }
}
