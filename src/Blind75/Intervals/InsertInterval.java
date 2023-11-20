package Blind75.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        System.out.println("Insert Interval");
//        int[][] intervals = {
//                {1, 2},
//                {3, 5},
//                {6, 7},
//                {8, 10},
//                {12, 16}
//        };
//
//        int[] newInterval = {4,8};


        int[][] intervals = {
                {1,5},
        };

        int[] newInterval = {2,3};

        insert(intervals,newInterval);
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();

        int i = 0;
        while(i < n && intervals[i][0] <= newInterval[0]){
            if(intervals[i][0] == newInterval[0]){
                if(intervals[i][1] <= newInterval[1]) list.add(intervals[i++]);
                else break;
            }else{
                list.add(intervals[i++]);
            }
        }

        list.add(newInterval);

        while(i < n)
            list.add(intervals[i++]);

        int count = 0, start = list.get(0)[0], end = list.get(0)[1];
        int[][] mergedIntervalsList = new int[list.size()][2];

        for (i = 1; i < list.size(); i++) {
            int s = list.get(i)[0], e = list.get(i)[1];
            if (s <= end) {
                end = Math.max(e, end);
            } else {
                mergedIntervalsList[count][0] = start;
                mergedIntervalsList[count][1] = end;
                start = s;
                end = e;
                count++;
            }
        }
        mergedIntervalsList[count][0] = start;
        mergedIntervalsList[count][1] = end;
        count++;

        int[][] finalAnsList = new int[count][2];
        for (i = 0; i < count; i++) {
            finalAnsList[i] = mergedIntervalsList[i];
        }

        return finalAnsList;
    }


}
