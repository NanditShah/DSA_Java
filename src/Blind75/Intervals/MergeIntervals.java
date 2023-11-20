package Blind75.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println("Merge Intervals");
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        List<int[]> ansList = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];

        for(int i = 0;i<intervals.length;i++){
            int s = intervals[i][0], e = intervals[i][1];
            if(s <= end) end = Math.max(e,end);
            else{
                ansList.add(new int[] {start,end});
                start = s;
                end = e;
            }
        }
        ansList.add(new int[] {start,end});
        return ansList.toArray(new int[ansList.size()][2]);
    }
}
