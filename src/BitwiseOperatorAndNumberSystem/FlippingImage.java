package BitwiseOperatorAndNumberSystem;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        System.out.println("Flipping an Image");
        int arr[] = {1,0,1,1,1,1,0};
        System.out.println(Arrays.toString(arr));
    }

        static int[][] flipAndInvertImage(int[][] image) {
            final int n = image.length;

            for (int i = 0; i < n; ++i)
                for (int j = 0; j < (n + 1) / 2; ++j) {
                    final int temp = image[i][j];
                    image[i][j] = image[i][n - j - 1] ^ 1;
                    image[i][n - j - 1] = temp ^ 1;
                }

            return image;
        }
}
