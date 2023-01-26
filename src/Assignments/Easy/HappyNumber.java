package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Happy Number");
//        System.out.println(sumOfSquares(0));
//        System.out.println(sumOfSquares(19));
//        System.out.println(sumOfSquares(82));
//        System.out.println(sumOfSquares(68));
//        System.out.println(sumOfSquares(100));
//        System.out.println(sumOfSquares(2));
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<>();
         while(n != 1){
            n = sumOfSquares(n);
            if(nums.contains(n)){
                return false;
            }else{
                nums.add(n);
            }
        }
        return true;
    }
    static int sumOfSquares(int n){
        int newAns = 0;
        while(n > 0){
            int lastDigit = n % 10;
            newAns += lastDigit*lastDigit;
            n = n /10;
        }
        return newAns;
    }
}
