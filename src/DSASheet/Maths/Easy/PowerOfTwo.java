package DSASheet.Maths.Easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Power of Two");
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0  && (Math.log(n) / Math.log(2)) % 1 == 0;
    }
}
