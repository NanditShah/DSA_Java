package Assignments.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class RightInterval {
    public static void main(String[] args) {
        System.out.println("Right Interval");
        int[][] intervals = {{1, 2}};

        findRightInterval(intervals);
    }

    static int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i = 0;
        int[] firsts = new int[intervals.length];
        for(int[] interval : intervals){
            hm.put(interval[0],i);
            firsts[i] = interval[0];
            i++;
        }

        Arrays.sort(firsts);
        System.out.println(hm.toString());
        int[] ans = new int[hm.size()];
        i = 0;
        for(int[] interval : intervals){
            int a = findGreatestMinimum(firsts,interval[1]);

            System.out.println(a);
            ans[i] = a == -1 ? a : hm.get(firsts[a]);
            i++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }


    static int findGreatestMinimum(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = start - ((start - end)/2);

            if(target == arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

}
