package Grind75;

import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {
        System.out.println("Course Schedule II");
        int[][] prerequisites = {};

        System.out.println(Arrays.toString(findOrder(1,prerequisites)));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indgree = new int[numCourses];

        HashMap<Integer, List<Integer>> children = new HashMap<>();

        for(int i = 0;i<numCourses;i++)
            children.put(i,new ArrayList<>());


        for(int[] prerequisite : prerequisites){
            children.get(prerequisite[1]).add(prerequisite[0]);
            indgree[prerequisite[0]]++;
        }


        Queue<Integer> helperQueue = new LinkedList<>();

        for(int i = 0;i<indgree.length;i++){
            int  in = indgree[i];
            if(in == 0) helperQueue.add(i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!helperQueue.isEmpty()){
            int topValue = helperQueue.remove();
            ans.add(topValue);
            for(int adjCourse : children.get(topValue)){
                indgree[adjCourse]--;
                if(indgree[adjCourse] == 0) helperQueue.add(adjCourse);
            }
        }

        int[] ansArray = new int[ans.size()];
        int i = 0;
        for(int a : ans) {
            ansArray[i] = a;
            i++;
        }
        return ansArray;
    }
}
