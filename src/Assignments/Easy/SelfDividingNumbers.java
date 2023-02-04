package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println("Self Dividing Numbers");
        System.out.println(isSelfDividingNumber(12));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(i <= 9){
                ans.add(i);
            }else{
                if(isSelfDividingNumber(i)){
                    ans.add(i);
                }
            }
        }
        return ans;
    }

    static boolean isSelfDividingNumber(int n){
        int number = n;
        while(n > 0){
            int d = n % 10;
            if(d == 0 || number % d != 0){
                return false;
            }
            n = n / 10;
        }
        return true;
    }
}
