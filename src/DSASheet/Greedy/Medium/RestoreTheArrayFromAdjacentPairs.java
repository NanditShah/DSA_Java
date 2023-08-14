package DSASheet.Greedy.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestoreTheArrayFromAdjacentPairs {
    public static void main(String[] args) {
        System.out.println("Restore the Array From Adjacent Pairs");
    }

    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        int[] ans = new int[adjacentPairs.length + 1];

        for(int[] pair : adjacentPairs){
            adjMap.putIfAbsent(pair[0],new ArrayList<>());
            adjMap.putIfAbsent(pair[1],new ArrayList<>());

            adjMap.get(pair[0]).add(pair[1]);
            adjMap.get(pair[1]).add(pair[0]);
        }
        int i = 0;
        for(Map.Entry<Integer,List<Integer>> entry : adjMap.entrySet()){
            if(entry.getValue().size() == 1){
                ans[i++] = entry.getKey();
                ans[i++] = entry.getValue().get(0);
                break;
            }
        }

        while(i < ans.length){
            int tail = ans[i - 1];
            int prev = ans[i - 2];
            List<Integer> ajds = adjMap.get(tail);
            if(prev == ajds.get(0)) ans[i++] = ajds.get(1);
            else ans[i++] = ajds.get(0);
        }
        return ans;
    }
}
