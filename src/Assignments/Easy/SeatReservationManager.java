package Assignments.Easy;

import java.util.PriorityQueue;

public class SeatReservationManager {
    public static void main(String[] args) {
        System.out.println("Seat Reservation Manager");
    }

    class SeatManager {
        PriorityQueue<Integer> availSeats;
        public SeatManager(int n) {
            availSeats = new PriorityQueue<>();
            for(int i = 1;i<=n;i++) availSeats.add(i);
        }

        public int reserve() {
            return availSeats.remove();
        }

        public void unreserve(int seatNumber) {
            availSeats.add(seatNumber);
        }
    }
}
