package Assignments.Graphs;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args) {
        System.out.println("Sign of the Product of an Array");
    }

    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for(int num : nums){
            if(num == 0) return 0;
            if(num < 0) negativeCount++;
        }

        return negativeCount % 2 == 0 ? 1 : -1;
    }
}
