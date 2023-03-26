package Assignments.Easy;

import java.util.Arrays;
import java.util.List;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        System.out.println("Game of Two Stacks");
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int[] aArr = new int[a.size()];
        int[] bArr = new int[b.size()];

        int i = 0;
        for(int aEle : a){
            aArr[i] = aEle;
            i++;
        }

        i = 0;
        for(int bEle : b){
            bArr[i] = bEle;
            i++;
        }

        // Write your code here
        return twoStacks(maxSum,aArr,bArr,0,0);
    }

    private static int twoStacks(int maxSum,int[] a, int[] b,int count,int currSum){
        if(currSum > maxSum){
            return count;
        }

        if(b.length == 0 || a.length == 0){
            return count;
        }

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a,1,a.length),b,count+1,currSum+a[0]);
        int ans2 = twoStacks(maxSum, a,Arrays.copyOfRange(b,1,b.length),count+1,currSum+b[0]);

        return Math.max(ans1,ans2);
    }
}
