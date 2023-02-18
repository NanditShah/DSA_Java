package Assignments.Easy;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {
        System.out.println("Number of Dice Rolls With Target Sum");
        int totalCounts = numRollsToTarget(30,30,500);
        System.out.println(totalCounts);
    }

    static int numRollsToTarget(int n, int k, int target) {
        if(target <= 0){
            if(n == 0){
                return 1;
            }else{
                return 0;
            }
        }
        int count = 0;
        for(int i = 1;i <= k && i <= target;i++){
            count += numRollsToTarget(n-1,k,target - i);
        }
        return count;
    }
}
