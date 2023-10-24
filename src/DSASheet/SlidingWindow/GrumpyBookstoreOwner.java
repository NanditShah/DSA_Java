package DSASheet.SlidingWindow;

public class GrumpyBookstoreOwner {
    public static void main(String[] args) {
        System.out.println("Grumpy Bookstore Owner");
    }

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = 0, j = 0, ans = Integer.MIN_VALUE, n = customers.length;
        int totalSumWhenNotGrumpy = 0;
        for(i = 0;i<n;i++)
            if(grumpy[i] == 0) totalSumWhenNotGrumpy += customers[i];

        i = 0;

        int totalSumIgnoringMood = 0;
        int windowSumWhenNotGrumpy = 0;
        while(j < n){
            totalSumIgnoringMood += customers[j];
            if(grumpy[j] == 0) windowSumWhenNotGrumpy += customers[j];

            if((j - i + 1) == minutes){
                ans = Math.max((totalSumWhenNotGrumpy - windowSumWhenNotGrumpy + totalSumIgnoringMood),ans);
                totalSumIgnoringMood -= customers[i];
                if(grumpy[i] == 0){
                    windowSumWhenNotGrumpy -= customers[i];
                }
                i++;
            }
            j++;
        }
        return ans;
    }

}
