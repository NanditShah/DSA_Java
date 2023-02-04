package Assignments.Easy;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println("Binary Gap");
        System.out.println(binaryGap(5));
    }

    static int binaryGap(int n) {
        int maxGap = 0;
        int gap = (n & 1) == 1 ? 1 : 0;
        while(n > 0){
            if((n & 1) == 1){
                if(gap > maxGap){
                    maxGap = gap;
                }
                gap = 1;
            }else{
                if(gap > 0){
                    gap++;
                }
            }
            n = n >> 1;
        }
        return maxGap;
    }
}
