package BitwiseOperatorAndNumberSystem;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Check if given number is prime of not");
        System.out.println(isPrime(4));
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
