package Assignments.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TimeNeededToInformAllEmployees {
    public static void main(String[] args) {
        System.out.println("Time Needed to Inform All Employees");
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0;i<manager.length;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<manager.length;i++){
            if(i != headID){
                adjList.get(manager[i]).add(i);
            }
        }

        Queue<int[]> traverseQueue = new LinkedList<>();
        traverseQueue.add(new int[] {headID,informTime[headID]});
        int ans = informTime[headID];

        while(!traverseQueue.isEmpty()){
            int[] poppedValue = traverseQueue.remove();
            ans = Math.max(poppedValue[1],ans);
            for(int emp : adjList.get(poppedValue[0])){
                traverseQueue.add(new int[] {emp,poppedValue[1]+informTime[emp]});
            }
        }

        return ans;
    }
}
