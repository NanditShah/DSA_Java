package Assignments.Easy;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        System.out.println("Final Value of Variable After Performing Operations");
    }

    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation : operations){
            if(operation.contains("+")){
                x ++;
            }else if(operation.contains("-")){
                x --;
            }
        }
        return x;
    }
}
