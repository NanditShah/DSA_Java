package Assignments.Easy;

public class PathWithMaximumGold {
    public static void main(String[] args) {
        System.out.println("Path with Maximum Gold");
        int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(grid));
    }

    static int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                    int sum = getGoldSum(grid,i,j);
                    maxGold = Math.max(maxGold,sum);
                }
            }
        }
        return maxGold;
    }

    static int getGoldSum(int[][] grid,int r,int c){
        if(r<0 || c < 0 || r > grid.length - 1 || c > grid[0].length - 1 || grid[r][c] == 0){
            return 0;
        }

        int temp = grid[r][c];
        grid[r][c] = 0;
        int upSum = getGoldSum(grid,r-1,c);
        int downSum = getGoldSum(grid,r+1,c);
        int leftSum = getGoldSum(grid,r,c-1);
        int rightSum = getGoldSum(grid,r,c+1);
        grid[r][c] = temp;


        return temp+Math.max(upSum,Math.max(downSum,Math.max(leftSum,rightSum)));
    }

}
