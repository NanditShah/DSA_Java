package DP.Memo;

import java.util.HashMap;

public class Fib {

    static HashMap<Integer,Integer> dp = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Fib");
        dp.put(0,0);
        dp.put(1,1);

        System.out.println(fib(20));

    }

    public static int fib(int n){
        if(!dp.containsKey(n))
            dp.put(n,fib(n - 1) + fib(n - 2));

        return dp.get(n);
    }
}
