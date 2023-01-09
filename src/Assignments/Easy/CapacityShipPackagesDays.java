package Assignments.Easy;

import java.util.Arrays;

public class CapacityShipPackagesDays {
    public static void main(String[] args) {
        System.out.println("Capacity To Ship Packages Within D Days");

        int[] weights = {10,50,100,100,50,100,100,100};
        int capacity = shipWithinDays(weights,5);
        System.out.println(capacity);
    }
    static int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int sum = 0;

        for(int weight : weights){
            if(weight > max) max = weight;
            sum += weight;
        }

        int start = max;
        int end = sum;
        int ans = 0;
        if(days == 1){
            return sum;
        }
        while(start < end){
            int mid = start - ((start - end)/2);
            int reqDays = requiredDays(weights,mid);
            if(reqDays > days){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;

            }
        }
        return ans;
    }

    static int requiredDays(int[] weights,int givenCapacity){
        int days = 1;
        int dayWeight = 0;
        for(int weight : weights){
            if((dayWeight+weight) <= givenCapacity){
                dayWeight += weight;
            }else{
                dayWeight = weight;
                days ++;
            }
        }
        return days;
    }
}
