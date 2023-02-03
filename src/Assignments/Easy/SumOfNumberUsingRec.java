package Assignments.Easy;

public class SumOfNumberUsingRec {
    public static void main(String[] args) {
        System.out.println("Sum of N numbers using recursion");
        System.out.println(sumOfNNums(5));
    }

    static int sumOfNNums(int n){
        if(n<=1){
            return n;
        }
        return n+sumOfNNums(n-1);
    }

}

