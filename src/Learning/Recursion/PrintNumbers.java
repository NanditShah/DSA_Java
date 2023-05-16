package Learning.Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Print numbers using recursion");
        print(5);
    }


    static void print(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
}
