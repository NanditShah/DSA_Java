package DSASheet.Maths.Easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Happy Number");
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        List<Integer> nums = new ArrayList<>();
        while(n != 1){
            n = getSumOfSquare(n);
            if(nums.contains(n)) return false;
            nums.add(n);
        }
        return true;
    }

    public static int getSumOfSquare(int n){
        int ans = 0;
        while(n > 0){
            ans += (n % 10)*(n % 10);
            n /= 10;
        }
        return ans;
    }
}
