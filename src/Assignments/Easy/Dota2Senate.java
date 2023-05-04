package Assignments.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        System.out.println("Dota2 Senate");
    }

    public String predictPartyVictory(String senate) {

        char[] senateArr = senate.toCharArray();

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        for(int i =  0;i<senateArr.length;i++){
            if(senateArr[i] == 'R'){
                rQueue.add(i);
            }else{
                dQueue.add(i);
            }
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()){
            int rSenate = rQueue.remove();
            int dSenate = dQueue.remove();

            if(rSenate < dSenate){
                rQueue.add(senateArr.length+rSenate);
            }else{
                dQueue.add(senateArr.length+dSenate);
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
