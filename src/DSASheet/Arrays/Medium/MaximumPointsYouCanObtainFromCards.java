package DSASheet.Arrays.Medium;

import java.util.Arrays;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        System.out.println("Maximum Points You Can Obtain from Cards");
        int arr[] = {9,7,7,9,7,7,9};

        System.out.println(maxScore(arr,7));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int left = 0,right = cardPoints.length - k;

        int total = sum(right,cardPoints.length - 1,cardPoints);
        int res = total;
        while(right < cardPoints.length){
            total += (cardPoints[left] - cardPoints[right]);
            res = Math.max(res,total);
            right++;
            left++;
        }
        return res;
    }

    public static int sum(int startIndex,int endIndex,int[] cardPoints){
        int sum = 0;
        for(int i = startIndex;i<=endIndex;i++){
            sum+= cardPoints[i];
        }
        return sum;
    }
}
