package DSASheet.Arrays.Medium;

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
        ansList.add(intervals[0]);
        for(int i = 1;i<intervals.length;i++){
            int listSize = ansList.size();
            if(intervals[i][0] <= ansList.get(listSize - 1)[1]){
                ansList.get(listSize - 1)[1] = Math.max(ansList.get(listSize - 1)[1],intervals[i][1]);
            }else{
                ansList.add(intervals[i]);
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }
}
