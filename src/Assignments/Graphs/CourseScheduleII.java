package Assignments.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    public static void main(String[] args) {
        System.out.println("Course Schedule II");
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<prerequisites.length;i++){
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree = new int[numCourses];

        for(int i = 0;i<numCourses;i++){
            for(int it : adjList.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> topoQueue = new LinkedList<>();
        for(int i =0;i<indegree.length;i++){
            if(indegree[i] == 0){
                topoQueue.add(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while(!topoQueue.isEmpty()){
            int node = topoQueue.remove();

            topo.add(node);

            for(int it: adjList.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) topoQueue.add(it);
            }
        }

        System.out.println(topo);

        if(topo.size() == numCourses) topo.toArray();
        return new int[] {};
    }
}
