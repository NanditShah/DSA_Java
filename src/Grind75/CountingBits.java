package Grind75;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println("Counting Bits");
    }

    public int[] countBits(int n) {
        int[] numOfBits = new int[n+1];

        for(int num = 1;num <= n; num++){
            numOfBits[num] = numOfBits[num / 2] + (num % 2 == 0 ? 0 : 1);
        }
        return numOfBits;
    }
}
