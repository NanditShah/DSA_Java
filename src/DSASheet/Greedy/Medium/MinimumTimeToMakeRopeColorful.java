package DSASheet.Greedy.Medium;

public class MinimumTimeToMakeRopeColorful {
    public static void main(String[] args) {
        System.out.println("Minimum Time to Make RoeColorful");
    }

    public int minCost(String colors, int[] neededTime) {
        int i =0,j = 0;
        int totalTime = 0;
        int n = neededTime.length;
        while(i < n && j < n){
            int maxTime = 0, currTotal = 0;
            while(j < n && colors.charAt(i) == colors.charAt(j)){
                maxTime = Math.max(neededTime[j],maxTime);
                currTotal += neededTime[j];
                j++;
            }
            i = j;
            totalTime += (currTotal - maxTime);
        }
        return totalTime;
    }
}
