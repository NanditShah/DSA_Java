package Assignments.Easy;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println("Number of Steps to Reduce a Number to Zero");
        System.out.println(numberOfSteps(123));
    }

    static int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if((num & 1) == 1){
                num -= 1;
            }else{
                num = num >> 1;
            }
            steps ++;
        }
        return steps;
    }
}
