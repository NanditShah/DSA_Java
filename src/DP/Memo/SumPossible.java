package DP.Memo;

import java.util.HashMap;

public class SumPossible {

    static HashMap<Integer,Boolean> memo = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Sum Possible");

//        base case
        memo.put(0,true);

        System.out.println(sumPossible(new int[] {3,7},100));
    }


    public static boolean sumPossible(int[] arr,int sum){
        if(sum < 0) return false;
        if(!memo.containsKey(sum)){
            boolean ans = false;
            for(int num : arr){
                if(sumPossible(arr,sum - num)){
                    ans = true;
                    break;
                }
            }
            memo.put(sum,ans);
        }
        return memo.get(sum);
    }
}
