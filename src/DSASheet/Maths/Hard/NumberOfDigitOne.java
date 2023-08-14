package DSASheet.Maths.Hard;

public class NumberOfDigitOne {
    public static void main(String[] args) {
        System.out.println("Number of Digit One");
        int noOnes = countDigitOne(13);
        System.out.println(noOnes);
    }

    public static int countDigitOne(int n) {
        int ones = 0, m = 1, r = 1;
        while (n > 0) {
            ones += (n + 8) / 10 * m + (n % 10 == 1 ? r : 0);
            r += n % 10 * m;
            m *= 10;
            n /= 10;
        }
        return ones;
    }
}
