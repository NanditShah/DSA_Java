package Learning.BitwiseOperatorAndNumberSystem;

import java.util.ArrayList;

public class OptimizedFactors {
    public static void main(String[] args) {
        System.out.println("Optimized factors");
        factors(40);
    }

    static void factors(int n){
        ArrayList<Integer> afterFactors = new ArrayList<>();
        for(int i = 1;i<= Math.sqrt(n);i++){
            if(n % i == 0){
                System.out.print(i+" ");
                if(i != n/i){
                    afterFactors.add(n/i);
                }
            }

        }
        for(int i = afterFactors.size()-1;i>=0;i--){
            System.out.print(afterFactors.get(i)+" ");
        }
    }

}
