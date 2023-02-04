package Assignments.Easy;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        System.out.println("Prime Number of Set Bits in Binary Representation");
        System.out.println(countPrimeSetBits(10,15));
    }

    static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left;i<=right;i++){
            int setBits = getSetBits(i);
            if(isPrime(setBits)){
                count++;
            }
        }
        return count;

    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static int getSetBits(int n){
        int count = 0;
        for(int i =0; i<32; i++){
            if( (n&1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
