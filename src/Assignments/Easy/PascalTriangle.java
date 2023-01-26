package Assignments.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle");
        List<List<Integer>> pascalTriangle = generate(1);
        for(List<Integer> row : pascalTriangle){
            System.out.println(Arrays.toString(row.toArray()));
        }
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstTerm = new ArrayList<>();
        firstTerm.add(1);
        ans.add(firstTerm);
        if(numRows == 1){
            return ans;
        }
        for(int i = 0;i<numRows-1;i++){
            ans.add(getNextPascalTerm(ans.get(i)));
        }
        return ans;
    }

    static List<Integer> getNextPascalTerm(List<Integer> prevPascalTerm){
        List<Integer> nextPascalTerm = new ArrayList<>();
        nextPascalTerm.add(1);
        if(prevPascalTerm.size() == 1){
            nextPascalTerm.add(1);
        }else{
            for(int i =0;i<prevPascalTerm.size()-1;i++){
                nextPascalTerm.add(prevPascalTerm.get(i)+prevPascalTerm.get(i+1));
            }
            nextPascalTerm.add(1);
        }
        return nextPascalTerm;
    }
}
