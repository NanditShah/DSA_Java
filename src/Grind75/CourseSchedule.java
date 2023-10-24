package Grind75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        System.out.println("Course Schedule");
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i = 0;i<numCourses;i++)
            adjList.add(new ArrayList<>());


        for(int[] prerequisite : prerequisites){
            adjList.get(prerequisite[1]).add(prerequisite[0]);
        }

        int[] indegrees = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            for(int adjNodes : adjList.get(i)) indegrees[adjNodes]++;
        }

        Queue<Integer> helperQueue = new LinkedList<>();
        for(int i = 0;i< numCourses;i++){
            if (indegrees[i] == 0) helperQueue.add(i);
        }

        int courseCompleted = 0;

        while(!helperQueue.isEmpty()){
            int topCourse = helperQueue.remove();
            courseCompleted++;
            for(int dependentCourse : adjList.get(topCourse)){
                indegrees[dependentCourse]--;
                if(indegrees[dependentCourse] == 0) helperQueue.add(dependentCourse);
            }
        }

        return courseCompleted == numCourses;
    }
}
