package BitwiseOperatorAndNumberSystem;

public class SetIthBit {
    public static void main(String[] args) {
        System.out.println("Set Ith bit in binary string of number");
        System.out.println(setIthBit(10,1));
    }

    static int setIthBit(int number,int i){
        return number | (1 << i - 1);
    }
}
