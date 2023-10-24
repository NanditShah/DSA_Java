package Grind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class InsertInterval {


    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Insert Interval");
        int[][] array = {
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

        int[][] ans = insert(array,new int[] {4,8});
        print2DArray(ans);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][] {newInterval};

        int[][] mergedList = new int[intervals.length+1][2];

        int i = 0;
        for(i = 0; i < intervals.length; i++){
            mergedList[i][0] = intervals[i][0];
            mergedList[i][1] = intervals[i][1];
        }
        mergedList[mergedList.length - 1][0] = newInterval[0];
        mergedList[mergedList.length - 1][1] = newInterval[1];


        Arrays.sort(mergedList,(a,b) -> Integer.compare(a[0],b[0]));

        int count = 0, start = mergedList[0][0], end = mergedList[0][1];
        int[][] mergedIntervalsList = new int[mergedList.length][2];
        for (i = 1; i < mergedList.length; i++) {
            int s = mergedList[i][0], e = mergedList[i][1];
            if (s <= end) {
                end = Math.max(e, end);
            } else {
                mergedIntervalsList[count][0] = start;
                mergedIntervalsList[count++][1] = end;
                start = s;
                end = e;
            }
        }
        mergedIntervalsList[count][0] = start;
        mergedIntervalsList[count++][1] = end;


        int[][] finalAnsList = new int[count][2];
        for (i = 0; i < count; i++) {
            finalAnsList[i] = mergedIntervalsList[i];
        }
        return finalAnsList;
    }   
}
