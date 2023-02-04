package BitwiseOperatorAndNumberSystem;

public class IthBitInBinaryString {
    public static void main(String[] args) {
        System.out.println("Ith bit in Binary string of given number");
        System.out.println(ithBitInNumber(13,2));
    }

    static int ithBitInNumber(int number,int i){
        return (number & (1 << i-1)) >> i-1;
    }

}
