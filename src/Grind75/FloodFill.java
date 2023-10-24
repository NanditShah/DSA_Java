package Grind75;

public class FloodFill {
    public static void main(String[] args) {
        System.out.println("Flood Fill");
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        fill(image,sr,sc,image[sr][sc],color);

        return image;
    }

    public void fill(int[][] image,int i,int j,int startColor,int newColor){
        if(i < 0 || i >=  image.length || j < 0 || j >= image[0].length || image[i][j] != startColor) return;

        image[i][j] = newColor;

        fill(image,i+1,j,startColor,newColor);
        fill(image,i-1,j,startColor,newColor);
        fill(image,i,j+1,startColor,newColor);
        fill(image,i,j-1,startColor,newColor);
    }
}
