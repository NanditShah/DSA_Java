package Assignments.Easy;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println("Jewels and Stones");
    }

    static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char stone : stones.toCharArray()){
            if(jewels.contains(stone+"")){
                count ++;
            }
        }
        return count;
    }
}
