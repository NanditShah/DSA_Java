package DSASheet.BinarySearch.Medium;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        System.out.println("Capacity To Ship Packages Within D Days");
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0], sum = 0;
        for(int weight : weights){
            max = Math.max(weight,max);
            sum += weight;
        }

        if(days == 1) return sum;
        if(days == weights.length) return max;

        int start = max,end = sum;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            int requiredDays = calculateRequiredDays(weights,mid);
            if(days < requiredDays){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid;
            }
        }
        return ans;
    }

    public int calculateRequiredDays(int[] weights,int capacity){
        int dailyWeight = 0;
        int days = 1;
        for(int weight : weights){
            if((weight + dailyWeight) <= capacity){
                dailyWeight += weight;
            }else{
                dailyWeight = weight;
                days++;
            }
        }
        return days;
    }
}
