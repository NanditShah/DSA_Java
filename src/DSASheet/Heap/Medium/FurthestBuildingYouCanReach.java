package DSASheet.Heap.Medium;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        System.out.println("Furthest Building You Can Reach");
        int[] heights = {1,4,6,7};
        System.out.println(furthestBuilding(heights,2,1));
    }

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(i = 1;i<heights.length;i++){
            int diff = heights[i] - heights[i-1];

            if(diff > 0){
                if(bricks >= diff){
                    bricks -= diff;
                    pq.add(diff);
                }else if(ladders > 0){
                    if(!pq.isEmpty()){
                        int topElement = pq.peek();
                        if(topElement > diff){
                            bricks += topElement;
                            pq.remove();
                            pq.add(diff);
                            bricks -= diff;
                        }
                    }
                    ladders --;
                }else break;
            }
        }
        return i - 1;
    }
}
