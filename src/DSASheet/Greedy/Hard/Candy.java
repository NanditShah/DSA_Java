package DSASheet.Greedy.Hard;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        System.out.println("Candy");
        int totalCandies = candy(new int[] {1,3,4,5,2});
        System.out.println(totalCandies);
    }

    public static int candy(int[] ratings) {
        int n = ratings.length;
        int candies = n;
        if(n == 1) return 1;

        int[] candiesArr = new int[n];
        for(int i = 1;i<n;i++){
            if(ratings[i] > ratings[i-1] && candiesArr[i] <= candiesArr[i-1]){
                candiesArr[i] = candiesArr[i-1] + 1;
            }
        }

        for(int i = n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1] && candiesArr[i] <= candiesArr[i+1]){
                candiesArr[i] = candiesArr[i+1] + 1;
            }
        }

        for(int candy : candiesArr){
            candies += candy;
        }

        return candies;
    }
}
