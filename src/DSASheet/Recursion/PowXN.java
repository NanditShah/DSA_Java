package DSASheet.Recursion;

public class PowXN {
    public static void main(String[] args) {
        System.out.println("Pow(x, n)");

        System.out.println(myPow(2.00000,10));
        System.out.println(myPow(2.10000,3));
        System.out.println(myPow(2.00000,-2));

    }

    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        double ans = getAns(x,Math.abs(n));
        return n < 0 ? 1/ans : ans;
    }

    public static double getAns(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }

        double ans = getAns(x*x,n/2);
        if(n % 2 == 1) ans *= x;
        return ans;
    }

}
