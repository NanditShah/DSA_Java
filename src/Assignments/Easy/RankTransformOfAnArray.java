package Assignments.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    public static void main(String[] args) {
        System.out.println("Rank Transform of an Array");
        int[] ans = arrayRankTransform(new int[] {40, 10, 20, 30});
        System.out.println(Arrays.toString(ans));
    }

    static int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Map<Integer,Integer> rankMap = new HashMap<>();

        Arrays.sort(sortedArr);

        for(int ele : sortedArr){
            rankMap.putIfAbsent(ele,rankMap.size()+1);
        }

        for (int i = 0; i < arr.length; ++i)
            arr[i] = rankMap.get(arr[i]);

        return arr;
    }
}
