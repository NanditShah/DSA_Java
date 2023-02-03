package Assignments.Easy;

public class NTo1 {
    public static void main(String[] args) {
        System.out.println("Print N to 1");
//        printNTo1(10);
//        print1ToN(10);
    printBoth(10);
    }

    static void printNTo1(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNTo1(n-1);

    }

    static void print1ToN(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
