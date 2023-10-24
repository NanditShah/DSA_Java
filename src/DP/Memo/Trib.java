package DP.Memo;

import java.util.HashMap;

public class Trib {

    static HashMap<Integer,Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Tribonacci");

//        Base cases
        memo.put(0,0);
        memo.put(1,0);
        memo.put(2,1);

        System.out.println(trib(25));
    }

    public static int trib(int n){
        if(!memo.containsKey(n)) memo.put(n,trib(n-1)+trib(n - 2)+trib(n - 3));
        return memo.get(n);
    }


}
