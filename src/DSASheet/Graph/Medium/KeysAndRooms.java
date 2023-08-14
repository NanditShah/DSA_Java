package DSASheet.Graph.Medium;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
        System.out.println("Keys and Rooms");
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> helperQueue = new LinkedList<>();
        helperQueue.add(0);
        visited.add(0);
        while(!helperQueue.isEmpty()){
            int topValue = helperQueue.remove();
            System.out.println(rooms.get(topValue));
            for(int key : rooms.get(topValue)){
                if(!visited.contains(key)) helperQueue.add(key);
                visited.add(key);
            }
        }

        return visited.size() == rooms.size();
    }
}
