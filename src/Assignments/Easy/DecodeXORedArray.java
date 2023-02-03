package Assignments.Easy;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        System.out.println("Decode XORed Array");
        System.out.println(Arrays.toString(decode(new int[] {6,2,7,3},4)));
    }

    static int[] decode(int[] encoded, int first) {
        int[] ansArr = new int[encoded.length+1];
        ansArr[0] = first;
        for(int i = 0;i<encoded.length;i++){
            ansArr[i+1] = getDecodedValue(encoded[i],ansArr[i]);
        }
        return ansArr;
    }

    static int getDecodedValue(int encoded,int key){
        return encoded ^ key;
    }
}
