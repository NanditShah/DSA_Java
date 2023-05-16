package Learning.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        System.out.println(fibonacciSeries(10));

    }

    public static int fibonacciSeries(int n){
        if(n < 2){
            return n;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

}
