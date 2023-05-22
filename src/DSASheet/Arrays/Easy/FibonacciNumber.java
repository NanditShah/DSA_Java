package DSASheet.Arrays.Easy;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Fibonacci Number");
    }

    public int fib(int n) {
        if(n < 2) return n;
        return fib(n - 1)+fib(n - 2);
    }

    public int fibIterative(int n) {
        if(n < 2) return n;
        int a = 0;
        int b = 1;
        int nThTerm = 0;
        for(int i =2;i<=n;i++){
            nThTerm = a + b;
            a = b;
            b = nThTerm;
        }
        return nThTerm;
    }
}
