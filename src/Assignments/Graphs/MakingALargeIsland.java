package Assignments.Graphs;

import Assignments.Graphs.Disjoint.Disjoint;

import java.util.HashSet;

public class MakingALargeIsland {
    public static void main(String[] args) {
        System.out.println("Making A Large Island");
    }

    int[] dirs = {0,1,0,-1,0};

    public boolean isValid(int x,int y,int n){
        if(x >= 0 && x < n && y >= 0 && y < n) return true;
        return false;
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length;

        Disjoint ds = new Disjoint(n*n);

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0) continue;
                for(int dir = 0;dir < 4;dir++){
                    int adjI = i + dirs[dir];
                    int adjJ = j + dirs[dir+1];
                    if(isValid(adjI,adjJ,n) && grid[adjI][adjJ] == 1){
                        int nodeNo = n * i + j;
                        int adjNodeNo = n * adjI + adjJ;
                        ds.unionBySize(nodeNo,adjNodeNo);
                    }
                }
            }
        }

        int maxComponent = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1) continue;
                HashSet<Integer> hashSet = new HashSet<>();
                for(int dir = 0;dir < 4;dir++) {
                    int adjI = i + dirs[dir];
                    int adjJ = j + dirs[dir + 1];
                    if (isValid(adjI, adjJ, n)) {
                        if(grid[adjI][adjJ] == 1){
                            hashSet.add(ds.findParent(adjI*n+adjJ));
                        }
                    }
                }

                int totalSize = 0;
                for(Integer parents : hashSet){
                    totalSize += ds.sizes.get(parents);
                }
                maxComponent = Math.max(maxComponent,totalSize+1);
            }
        }

        for(int cellNo = 0;cellNo < n*n;cellNo++){
            maxComponent = Math.max(maxComponent,ds.sizes.get(ds.findParent(cellNo)));
        }

        return maxComponent;

    }
}
