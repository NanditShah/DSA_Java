package Assignments.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        System.out.println("Cheapest Flights Within K Stops");

        int n = 5;
        int[][] flights = {{1,2,10},{2,0,7},{1,3,8},{4,0,10},{3,4,2},{4,2,10},{0,3,3},{3,1,6},{2,4,5}};

        System.out.println(findCheapestPrice(n,flights,0,4,1));
    }

    static class City{
        int destination;
        int fare;

        public City(int destination, int fare) {
            this.destination = destination;
            this.fare = fare;
        }

    }

    static class Pair{
        int steps;
        int city;
        int cost;

        public Pair(int steps, int city, int cost) {
            this.steps = steps;
            this.city = city;
            this.cost = cost;
        }
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<City>> ajdList = new ArrayList<>();

        for(int i = 0;i<n;i++){
            ajdList.add(new ArrayList<>());
        }

        for(int i = 0;i< flights.length;i++){
            ajdList.get(flights[i][0]).add(new City(flights[i][1],flights[i][2]));
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0,src,0));

        int[] distance = new int[n];

        for(int i = 0;i<n;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        while(!queue.isEmpty()){
            Pair removedPair = queue.remove();
            int city = removedPair.city;
            int steps = removedPair.steps;
            int cost = removedPair.cost;

            if(steps > k) continue;

            for(City adjNode : ajdList.get(city)){
                int adjCity = adjNode.destination;
                int costToAdjCity = adjNode.fare;

                if(costToAdjCity+cost < distance[adjCity] && steps <= k){
                    distance[adjCity] = costToAdjCity+cost;
                    int newSteps = adjCity == dst ? steps : steps+1;
                    queue.add(new Pair(newSteps,adjCity,costToAdjCity+cost));
                }
            }
        }

        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }
}
