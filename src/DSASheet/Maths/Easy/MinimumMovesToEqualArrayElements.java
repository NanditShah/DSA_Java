package DSASheet.Maths.Easy;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        System.out.println("Minimum Moves to Equal Array Elements");
        System.out.println(minMoves(new int[] {1,2}));
    }

    public static int minMoves(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int min = Arrays.stream(nums).min().getAsInt();
        return sum - min * nums.length;
    }
}
