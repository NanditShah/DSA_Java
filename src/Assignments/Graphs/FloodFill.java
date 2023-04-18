package Assignments.Graphs;

public class FloodFill {
    public static void main(String[] args) {
        System.out.println("Flood Fill");
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        int[][] ans = image;

        dfs(image,ans,sr,sc,initColor,color);

        return ans;
    }

    private static final int[] dirs = {0, 1, 0, -1, 0};

    private void dfs(int[][] image, int[][] ans, int sr, int sc, int initColor, int color) {
        ans[sr][sc] = color;

        int n = image.length;
        int m = image[0].length;

        for(int k = 0;k < 4;k++){
            int nRow = sr + dirs[k];
            int nCol = sc +  dirs[k + 1];
            if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && image[nRow][nCol] == initColor && ans[nRow][nCol] != color){
                dfs(image,ans,nRow,nCol,initColor,color);
            }
        }

    }
}
