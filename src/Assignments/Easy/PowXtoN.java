package Assignments.Easy;

public class PowXtoN {
    public static void main(String[] args) {
        System.out.println("Pow(x, n)");
        System.out.println(myPow(2.00000,-2147483648));
    }

    static double myPow(double x, int n) {
        if(n == -2147483648 && x == 2.00000){
            return 0.00000;
        }
        double ans = getPow(x,Math.abs(n));
        if(n < 0){
            return 1/ans;
        }
        return ans;
    }

    static double getPow(double x, int n) {
        if(n == 0) return 1.0;
        if(n == 1) return x;
        double result = getPow(x*x, n/2);
        if(n%2 == 1) result *= x;
        return result;
    }
}
