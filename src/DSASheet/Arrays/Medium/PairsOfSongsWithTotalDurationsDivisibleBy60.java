package DSASheet.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public static void main(String[] args) {
        System.out.println("Pairs of Songs With Total Durations Divisible by 60");
    }

    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;

        Map<Integer,Integer> hMap = new HashMap<>();

        for(int t : time){
            int modOperation = t % 60;
            if(modOperation == 0){
                count += hMap.getOrDefault(modOperation,0);
            }else{
                count += hMap.getOrDefault(60 - modOperation,0);
            }
            hMap.put(modOperation,hMap.getOrDefault(modOperation,0)+1);
        }
        return count;
    }
}
