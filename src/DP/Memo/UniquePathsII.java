package DP.Memo;


// Leetcode 63
public class UniquePathsII {
    public static void main(String[] args) {
        System.out.println("Unique Paths II");

        int[][] myArray = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        System.out.println(uniquePathsWithObstacles(myArray));
    }

    static int[][] dirs = {{0,1},{1,0}};
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;


        for(int i = 0;i<m;i++)
            for(int j = 0;j < n;j++)
                if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = -1;

        obstacleGrid[m - 1][n - 1] = 1;

        countPaths(0,0,obstacleGrid,m,n);
        return obstacleGrid[0][0];
    }

    public static int countPaths(int x,int y,int[][] obstacleGrid,int m,int n){
        if(x < 0 || x >= m || y < 0 || y >= n) return 0;

        if(obstacleGrid[x][y] == -1) return 0;
        if(obstacleGrid[x][y] > 0) return obstacleGrid[x][y];

        for(int dir[] : dirs){
            int _x = x + dir[0];
            int _y = y + dir[1];

            obstacleGrid[x][y] += countPaths(_x,_y,obstacleGrid,m,n);
        }
        return obstacleGrid[x][y];
    }
}
