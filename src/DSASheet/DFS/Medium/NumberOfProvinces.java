package DSASheet.DFS.Medium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    public static void main(String[] args) {
        System.out.println("Number of Provinces");
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        int numProvinces = findCircleNum(isConnected);
        System.out.println(numProvinces);
    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i != j && isConnected[i][j] == 1){
                    adjList.get(i).add(j);
                }
            }
        }

        int[] visited = new int[n];
        int provinces = 0;

        for(int i = 0;i<n;i++){
            if(visited[i] == 0) {
                provinces++;
                dfs(i,visited,adjList);
            }
        }
        return provinces;
    }

    private static void dfs(int city,int[] visited, List<List<Integer>> adjList) {
        visited[city] = 1;
        for(int adjCity : adjList.get(city)){
            if(visited[adjCity] == 0){
                dfs(adjCity,visited,adjList);
            }
        }
    }
}
