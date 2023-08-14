package DSASheet.Graph.Medium;

import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {
        System.out.println("Network Delay Time");
    }

    class Solution {
        public int networkDelayTime(int[][] times, int n, int k) {
            Map<Integer,List<int[]>> map=new HashMap<>();
            for(int i[]:times)
            {
                if(!map.containsKey(i[0]))map.put(i[0],new ArrayList<>());
                map.get(i[0]).add(new int[]{i[1],i[2]});
            }

            Set<Integer> visited=new HashSet<>();
            Queue<int[]> minheap=new PriorityQueue<>((a,b)->a[1]-b[1]);

            minheap.add(new int[]{k,0});
            int ans=0;
            while(!minheap.isEmpty())
            {
                int val[]=minheap.poll();
                int src=val[0],w=val[1];
                if(visited.contains(src))continue;
                visited.add(src);
                ans=w;
                if(!map.containsKey(src))continue;
                for(int i[]:map.get(src))
                {
                    minheap.add(new int[]{i[0],i[1]+w});
                }
            }
            return visited.size()==n?ans:-1;

        }
    }
}
