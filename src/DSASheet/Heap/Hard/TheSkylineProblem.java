package DSASheet.Heap.Hard;

import java.util.*;

public class TheSkylineProblem {
    public static void main(String[] args) {
        System.out.println("The Skyline Problem");
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();

        for(int[] building : buildings){
            heights.add(new int[] {building[0], building[2]});
            heights.add(new int[] {building[1], building[2]});
        }
        Collections.sort(heights, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        int prevMax = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(0);

        for(int[] height : heights){
            if(height[1] < 0) heap.add(-height[1]);
            else heap.remove(height[1]);

            int currMax = heap.peek();

            if(currMax != prevMax){
                ans.add(Arrays.asList(height[0],currMax));
                prevMax = currMax;
            }
        }

        return ans;
    }
}
