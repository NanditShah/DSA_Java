package Assignments.Easy;

public class ReverseNumByRec {
    public static void main(String[] args) {
        System.out.println("Reverse a number using recursion");
        System.out.println(reverseNumber(1234));
    }

    static int reverseNumber(int n){
        if(n < 10){
            return n;
        }
        int numLength = Integer.toString(n / 10).length();
        return (int) ((n % 10) * Math.pow(10,numLength) + reverseNumber(n/10));
    }
}
