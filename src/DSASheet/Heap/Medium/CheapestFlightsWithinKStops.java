package DSASheet.Heap.Medium;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        System.out.println("Cheapest Flights Within K Stops");
    }

    class City{
        int destination;
        int fare;

        public City(int destination, int fare) {
            this.destination = destination;
            this.fare = fare;
        }
    }

    class Pair{
        int steps;
        int city;
        int cost;

        public Pair(int steps, int city, int cost) {
            this.steps = steps;
            this.city = city;
            this.cost = cost;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
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
