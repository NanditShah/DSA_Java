package DSASheet.Maths.Easy;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Reverse Integer");
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative) x *= -1;
        long ans = 0;
        while(x > 0){
            ans += x % 10;
            x /= 10;
            if(x > 0) ans *= 10;

            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        }
        return (int) (isNegative ? -ans : ans);
    }
}
