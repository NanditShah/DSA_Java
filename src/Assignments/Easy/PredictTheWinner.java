package Assignments.Easy;

//Not solved
public class PredictTheWinner {
    public static void main(String[] args) {
        System.out.println("Predict the Winner");
        System.out.println(PredictTheWinner(new int[] {1,5,2}));
    }

    static boolean PredictTheWinner(int[] nums) {
        int[] scores = new int[2];
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int bestScore = getWinner(nums,0,nums.length-1,true);
        System.out.println(bestScore);
        return bestScore >= sum - bestScore;
    }

    static int getWinner(int[] nums,int start,int end,boolean isPlayerOneTurn){

        int score = 0;

        if(start >= end){
            if(isPlayerOneTurn){
                return nums[start];
            }else{
                return score;
            }
        }
        if(isPlayerOneTurn){
            if(nums[start] > nums[end]){
                score += nums[start];
                start ++;
            }else{
                score += nums[end];
                end --;
            }
        }else{
            if(nums[start] < nums[end]){
                start ++;
            }else{
                end --;
            }
        }
        score += getWinner(nums,start,end,!isPlayerOneTurn);
        return score;
    }

//    static int sum()
}
