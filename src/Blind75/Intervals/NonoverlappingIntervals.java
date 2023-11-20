package Blind75.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonoverlappingIntervals {
    public static void main(String[] args) {
        System.out.println("Non-overlapping Intervals");
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);

        int ans = 0;
        int end = intervals[0][1];

        for(int i = 1;i<intervals.length;i++){
            int s = intervals[i][0], e = intervals[i][1];
            if(s < end){
                end = Math.min(e,end);
                ans++;
            }else{
                end = e;
            }
        }
        return ans;
    }
}
