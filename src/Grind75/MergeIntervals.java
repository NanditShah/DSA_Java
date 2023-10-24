package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println("Merge Intervals");
        int[][] array = {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18}
                {1,4},{4,5}
        };

        int[][] mergedIntervals = merge(array);
        print2DArray(mergedIntervals);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        List<int[]> ansList = new ArrayList<>();
        ansList.add(intervals[0]);
        int[] currInterval = intervals[0];
        int i = 1;
        while(i < intervals.length){
            if(currInterval[1] >= intervals[i][0]){
                while(i < intervals.length && currInterval[1] >= intervals[i][0]){
                    currInterval[1] =  Math.max(currInterval[1],intervals[i][1]);
                    i++;
                }
                ansList.get(ansList.size() - 1)[1] = currInterval[1];
            }else{
                ansList.add(intervals[i]);
                currInterval = intervals[i];
                i++;
            }
        }

        return ansList.toArray(new int[ansList.size()][]);
    }
}
