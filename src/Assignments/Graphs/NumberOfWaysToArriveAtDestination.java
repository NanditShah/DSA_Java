package Assignments.Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveAtDestination {
    public static void main(String[] args) {
        System.out.println("Number of Ways to Arrive at Destination");
    }


    class Pair {
        int city,distance;

        public Pair(int city, int distance) {
            this.city = city;
            this.distance = distance;
        }
    }

    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
            int mod = (int)(1e9 + 7);

        for(int i =0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i =0;i<roads.length;i++){
            adjList.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adjList.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> a.distance - b.distance);

        int[] disArr = new int[n];
        int[] steps = new int[n];

        for(int i = 0;i<n;i++){
            disArr[i] = Integer.MAX_VALUE;
            steps[i] = 0;
        }

        steps[0] = 1;
        disArr[0] = 0;

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair removedPair = pq.remove();

            int city = removedPair.city;
            int dis = removedPair.distance;

            for(Pair adjPair : adjList.get(city)){
                int adjCity = adjPair.city;
                int adjCityDistance = adjPair.distance;

                if(dis+adjCityDistance < disArr[adjCity]){
                    disArr[adjCity] = dis+adjCityDistance;
                    steps[adjCity] = steps[city];
                    pq.add(new Pair(adjCity,dis+adjCityDistance));
                }else if(dis+adjCityDistance == disArr[adjCity]){
                    steps[adjCity] += steps[city];
                    steps[adjCity] %= mod;
                }
            }
        }

        return steps[n-1] % mod;
    }
}
