package DSASheet.Maths.Easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Missing Number");
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = 0;
        for(int i = 1; i <= n; ++i) {
            expected += i;
        }
        int current = 0;
        for(int x: nums) {
            current += x;
        }
        return expected - current;
    }
}
