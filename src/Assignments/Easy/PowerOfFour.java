package Assignments.Easy;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println("Power of Four");
        System.out.println(isPowerOfTwo(536870912));
    }

    static boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
    }

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (Math.log(n)/Math.log(2)) % 1 == 0;
    }
}
