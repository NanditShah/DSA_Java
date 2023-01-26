package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapAdjacentInLRString {
    public static void main(String[] args) {
        System.out.println("Swap Adjacent in LR String");
        System.out.println(canTransform("RL","LR"));
    }

    static boolean canTransform(String start, String end) {
        int n =start.length();

        if(!start.replaceAll("X","").equals(end.replaceAll("X",""))){
            return false;
        }

        List<Integer> LStart = new ArrayList<>();
        List<Integer> LEnd = new ArrayList<>();
        List<Integer> RStart = new ArrayList<>();
        List<Integer> REnd = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(start.charAt(i) == 'L'){
                LStart.add(i);
            }
            if(end.charAt(i) == 'L'){
                LEnd.add(i);
            }
            if(start.charAt(i) == 'R'){
                RStart.add(i);
            }
            if(end.charAt(i) == 'R'){
                REnd.add(i);
            }
        }
        System.out.println((Arrays.toString(LStart.toArray())));
        System.out.println((Arrays.toString(LEnd.toArray())));
        System.out.println((Arrays.toString(RStart.toArray())));
        System.out.println(Arrays.toString(REnd.toArray()));
        if(LStart.size() != LEnd.size()){
            return false;
        }
        if(RStart.size() != REnd.size()){
            return false;
        }
        for(int i = 0;i<LStart.size();i++){
            if(LStart.get(i) < LEnd.get(i)){
                return false;
            }
        }

        for(int i = 0;i<RStart.size();i++){
            if(RStart.get(i) > REnd.get(i)){
                return false;
            }
        }
        return true;
    }
}
