package DSASheet.DFS.Medium;

import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {
        System.out.println("Course Schedule II");
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        int[] order = findOrder(4,prerequisites);
        System.out.println(Arrays.toString(order));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adjMap = new HashMap<Integer, List<Integer>>();
        HashSet<Integer> cycle = new HashSet<>();
        boolean[] visited = new boolean[numCourses];
        ArrayList<Integer> ansList = new ArrayList<>();

        for(int i = 0;i<numCourses;i++) adjMap.putIfAbsent(i,new ArrayList<>());
        for(int[] preq : prerequisites){
            adjMap.get(preq[1]).add(preq[0]);
        }

        System.out.println(adjMap);
        for(int i = 0;i<numCourses;i++){
            if(!visited[i]){
                if(!dfs(adjMap,cycle,visited,ansList,i)){
                    return new int[] {};
                }
            }
        }
        int[] ans = new int[ansList.size()];
        int i = ansList.size() - 1;
        for(int a : ansList) {
            ans[i] = a;
            i--;
        }
        return ans;
    }

    private static boolean dfs(HashMap<Integer, List<Integer>> adjMap, HashSet<Integer> cycle,
                               boolean[] visited, ArrayList<Integer> ansList,int node) {
        if(cycle.contains(node)) return false;
        if(visited[node]) return true;

        cycle.add(node);
        for(int adjNode : adjMap.get(node)){
            if(!visited[adjNode]){
                if(cycle.contains(adjNode) || !dfs(adjMap,cycle,visited,ansList,adjNode)){
                    return false;
                }
            }
        }
        cycle.remove(node);
        visited[node] = true;
        ansList.add(node);
        return true;
    }
}
