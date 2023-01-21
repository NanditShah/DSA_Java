package Assignments.Easy;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public static void main(String[] args) {
        System.out.println("Can Make Arithmetic Progression From Sequence");
    }

    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[0] - arr[1];
        for(int i =2;i<arr.length;i++){
            if(arr[i] - arr[i-1] != d){
                return false;
            }
        }
        return true;
    }
}
