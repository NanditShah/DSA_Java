package Assignments.Easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Find factorial using recursion");
        System.out.println(fact(10));
    }

    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }
}
