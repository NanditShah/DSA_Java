package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println("Merge Intervals");
//        int[][] intervals = {{1, 3},{ 2, 6},{8, 12},{9, 12},{12, 14},{15, 18}};
        int[][] intervals = {{1,4},{4,5}};
        int[][] ans = merge(intervals);

        for(int[] interval : ans){
            System.out.println(Arrays.toString(interval));
        }
    }

    static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        for (int[] interval : intervals)
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0])
                ans.add(interval);
            else
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);

        return ans.toArray(new int[ans.size()][]);
    }


    static int[] mergedArr(int[] arr1,int[] arr2){
        return new int[] {arr1[0],arr2[1]};
    }
}
