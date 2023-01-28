package BitwiseOperatorAndNumberSystem;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Odd or even");
        System.out.println(isOdd(45));
        System.out.println(isOdd(44));
        System.out.println(isOdd(49));

    }

    static boolean isOdd(int n){
        if((n & 1) == 1) return true;
        return false;
    }
}
