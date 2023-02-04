package Assignments.Easy;

public class CountOfZeroByRec {
    public static void main(String[] args) {
        System.out.println("Count of zeros in number using recursion");
        System.out.println(countOfZeros(12301210));
    }

    static int count = 0;
    static int countOfZeros(int n){
        if(n == 0){
            count++;
            return count;
        }else if (n < 10){
            return count;
        }else if(n % 10 == 0){
            count++;
        }
        return countOfZeros(n / 10);
    }
}
