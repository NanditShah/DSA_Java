package DSASheet.Greedy.Medium;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        System.out.println("Non-overlapping Intervals");
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int prevEnd = intervals[0][1];
        int ans = 0;
        for(int i = 1;i<intervals.length;i++){
            int[] interval = intervals[i];
            if(interval[0] < prevEnd){
                prevEnd = Math.min(interval[1],prevEnd);
                ans++;
            }else{
                prevEnd = interval[1];
            }
        }
        return ans;
    }
}
