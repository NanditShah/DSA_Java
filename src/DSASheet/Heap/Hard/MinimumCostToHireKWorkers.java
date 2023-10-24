package DSASheet.Heap.Hard;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostToHireKWorkers {
    public static void main(String[] args) {
        System.out.println("Minimum Cost to Hire K Workers");
    }

    class Worker implements Comparable<Worker>{
        int quality,wage;

        public Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
        }

        public double getRatio(){
            return (double) wage/quality;
        }


        @Override
        public int compareTo(Worker otherWorker) {
            return this.getRatio() > otherWorker.getRatio() ? 1 : this.getRatio() < otherWorker.getRatio() ? -1 : 0;
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];

        for(int i = 0;i<n;i++){
            workers[i] = new Worker(quality[i],wage[i]);
        }

        Arrays.sort(workers);
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);

        double cost = Double.MAX_VALUE;
        int totalQuality = 0;
        for(Worker worker : workers){
            totalQuality += worker.quality;
            heap.add(worker.quality);

            if(heap.size() > k) {
                totalQuality -= heap.remove();
            }
            if(heap.size() == k) cost = Math.min(cost,worker.getRatio() * totalQuality);
        }

        return cost;
    }
}
