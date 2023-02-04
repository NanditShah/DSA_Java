package Assignments.Easy;

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        System.out.println("Binary Number with Alternating Bits");
        System.out.println(hasAlternatingBits(11));
    }

    static boolean hasAlternatingBits(int n) {
        boolean isEven = n % 2 == 0;
        n = n >> 1;
        while(n > 0){
            if(isEven){
                if(n % 2 == 0) return false;
                else isEven = false;
            }else{
                if(n % 2 != 0) return false;
                else isEven = true;
            }
            n = n >> 1;
        }
        return true;
    }
}
