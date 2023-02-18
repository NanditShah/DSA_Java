package Assignments.Easy;

import java.util.ArrayList;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        System.out.println("Letter Tile Possibilities");
        System.out.println(numTilePossibilities("AAABBC"));
    }

    static int numTilePossibilities(String tiles) {
        int count  = 0;
        int[] feq = new int[26];
        for(char c : tiles.toCharArray()){
            feq[c - 'A']++;
        }
        count = getTotalCombinationCount(feq);
        return count;
    }

    static  int getTotalCombinationCount(int[] feq){
        int count = 0;
        for(int i = 0;i< 26;i++){
            if(feq[i] == 0) continue;
            count ++;
            feq[i] --;
            count += getTotalCombinationCount(feq);
            feq[i] ++;
        }
        return count;
    }
}
