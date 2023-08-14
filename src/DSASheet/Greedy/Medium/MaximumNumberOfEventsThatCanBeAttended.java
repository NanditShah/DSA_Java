package DSASheet.Greedy.Medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumNumberOfEventsThatCanBeAttended {
    public static void main(String[] args) {
        System.out.println("Maximum Number of Events That Can Be Attended");
        int[][] events = {{1,5},{1,5},{1,5},{2,3},{2,3}};
        int maxEventsAttended = maxEvents(events);
        System.out.println(maxEventsAttended);
    }

    public static int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        PriorityQueue<Integer> eventByEndDay = new PriorityQueue<>();

        int totalEventsAttended = 0;
        int j = 0;

        for(int i = 0;i<100_001;i++){
            while(!eventByEndDay.isEmpty() && i > eventByEndDay.peek()) eventByEndDay.remove();

            for(; j < events.length && events[j][0] == i;j++) eventByEndDay.add(events[j][1]);

            if(!eventByEndDay.isEmpty()){
                eventByEndDay.remove();
                totalEventsAttended++;
            }
        }
        return totalEventsAttended;
    }
}
