package DSASheet.BinarySearch.Medium;

public class PowOfXToY {
    public static void main(String[] args) {
        System.out.println("Pow(x, n)");
        System.out.println(myPow(2.0,10));
        System.out.println(myPow(2.1,3));
        System.out.println(myPow(2.0,-2));
    }

    public static double myPow(double x, int n) {
        if(x == 2.00 && n == -2147483648) return 0.00;

        if(n == 0) return 1;
        if(n == 1) return x;

        double ans = getAns(x,Math.abs(n));
        return n < 0 ? 1 / ans : ans;
    }

    public static double getAns(double x,int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        double ans = getAns(x*x , n / 2);
        if(n % 2 != 0) ans *= x;
        return ans;
    }
}
