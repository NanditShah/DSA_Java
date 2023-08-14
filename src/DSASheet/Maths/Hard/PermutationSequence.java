package DSASheet.Maths.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println("Permutation Sequence");
        System.out.println(getPermutation(4,9));
    }

    public static String getPermutation(int n, int k) {
        int[] fact = new int[n+1];
        int intitialFact = 1;
        fact[0] = 1;
        for(int i = 1;i<=n;i++){
            fact[i] = intitialFact * i;
            intitialFact = fact[i];
        }

        List<Integer> nums = new ArrayList<>();

        for(int i = 1;i<n+1;i++) nums.add(i);

        String ans = getAns(fact,nums,k);
        return ans;
    }

    public static String getAns(int[] fact,List<Integer> nums,int k){
        int n = nums.size();
        int index = k / fact[n-1];
        if(k % fact[n-1] == 0) index --;
        String ans = "";
        ans += nums.get(index);
        nums.remove(index);
        if(nums.size() > 0){
            ans += getAns(fact,nums,k % fact[n - 1] == 0 ? fact[n - 1] :k % fact[n - 1]);
        }
        return ans;
    }
}
