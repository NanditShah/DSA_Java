package Assignments.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    public static void main(String[] args) {
        System.out.println("01 Matrix");
    }

    class Pair{
        int m;
        int n;
        int distance;

        public Pair(int m,int n,int distance){
            this.m = m;
            this.n = n;
            this.distance = distance;
        }
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] visited = new int[m][n];
        int[][] ans = new int[m][n];

        Queue<Pair> bfsQueue = new LinkedList<>();

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j] == 0){
                    visited[i][j] = 1;
                    bfsQueue.add(new Pair(i,j,0));
                }else{
                    visited[i][j] = 0;
                }
            }
        }

        while(!bfsQueue.isEmpty()){
            Pair dequedPair = bfsQueue.remove();
            int x = dequedPair.m;
            int y = dequedPair.n;
            int d = dequedPair.distance;

            ans[x][y] = d;

            for(int k = 0;k<4;k++){
                int kx = x+dirs[k];
                int ky = y+dirs[k+1];

                if(kx >= 0 && kx < m && ky >= 0 && ky < n && visited[kx][ky] == 0){
                    bfsQueue.add(new Pair(kx,ky,d+1));
                    visited[kx][ky] = 1;
                }
            }
        }

        return ans;

    }
}
