package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        System.out.println("Dice");
//        printDiceSteps("",7,6);
        List<String> steps = diceStepList("",7,6);
        System.out.println(steps);
    }

    static void printDiceSteps(String processed,int target,int diceFaces){
        if(target <= 0){
            System.out.println(processed);
            return;
        }
        for(int i = 1;i<=diceFaces && i<=target;i++){
            printDiceSteps(processed+i,target-i,diceFaces);
        }
    }

    static List<String> diceStepList(String processed, int target, int diceFaces){
        if(target <= 0){
            List<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        for(int i = 1;i<=diceFaces && i<=target;i++){
            ans.addAll(diceStepList(processed+i,target-i,diceFaces));
        }
        return ans;
    }
}
