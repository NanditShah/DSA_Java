package Assignments.Easy;

public class SumOfDigitsUsingRec {
    public static void main(String[] args) {
        System.out.println("Sum of digits in a given number by recursion");
        System.out.println(sumOfDigits(8));
    }

    static int sumOfDigits(int n){
        if(n < 10){
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }


//    Same code for finding product, just an operator change
    static int productOfDigits(int n){
        if(n < 10){
            return n;
        }
        return n % 10 * productOfDigits(n / 10);
    }
}
