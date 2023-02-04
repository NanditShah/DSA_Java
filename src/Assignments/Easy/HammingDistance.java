package Assignments.Easy;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println("Hamming distance");
        System.out.println(getHammingDistance(3,3));
    }

    static int getHammingDistance(int x, int y) {
        int hammingDistance = x ^ y;
        int count = 0;
        while(hammingDistance> 0){
            if(hammingDistance % 2 != 0){
                count ++;
            }
            hammingDistance = hammingDistance >> 1;
        }
        return count;
    }
}
