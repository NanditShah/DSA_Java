package Assignments.Easy;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println("Permutation Sequence");
        System.out.println(getPermutation(2,2));
    }

    static String getPermutation(int n, int k) {
        int[] fact = new int[n+1];
        List<Integer> numbers = new ArrayList<>();
        fact[0] = fact[1] = 1;

        for (int i = 2; i < fact.length; i++)
            fact[i] = fact[i-1] * i;
        for (int i = 1; i <= n; i++)
            numbers.add(i);
        String ans = getAns(numbers,fact,k);
        return ans;
    }

    static String getAns(List<Integer> numbers,int[] fact,int k){
        int n = numbers.size();
        int index = k/fact[n-1];
        if(k%fact[n-1]==0){
            index--;
        }
        String ans = "";
        ans += numbers.get(index);
        numbers.remove(index);
        if(numbers.size() > 0){
            ans += getAns(numbers,fact,k % fact[n-1] == 0 ? fact[n-1] : k % fact[n-1]);
        }
        return ans;
    }
}
