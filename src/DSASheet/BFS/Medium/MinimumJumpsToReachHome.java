package DSASheet.BFS.Medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumJumpsToReachHome {
    public static void main(String[] args) {
        System.out.println("Minimum Jumps to Reach Home");
    }

    class Node{
        int val;
        boolean isBackward;
        public Node(int val,boolean isBackward){
            this.val = val;
            this.isBackward = isBackward;
        }
    }

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> visited = new HashSet<>();
        for(int seen : forbidden){
            visited.add(seen);
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0,false));
        visited.add(0);
        int level = 0;
        int limit = 6000;

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Node curr = q.remove();
                if(curr.val == x){
                    return level;
                }

                if(!curr.isBackward){
                    int nextBackPos = curr.val - b;
                    if(nextBackPos > 0 && !visited.contains(nextBackPos)){
                        q.offer(new Node(nextBackPos,true));
                        visited.add(nextBackPos);
                    }
                }

                int nextForwardPos = curr.val + a;
                if(nextForwardPos < limit && !visited.contains(nextForwardPos)){
                    q.offer(new Node(nextForwardPos,false));
                    visited.add(nextForwardPos);
                }
            }
            level++;
        }
        return -1;
    }
}
