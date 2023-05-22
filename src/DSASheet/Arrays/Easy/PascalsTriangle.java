package DSASheet.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle");
        List<List<Integer>> ansList = new ArrayList<>();

        ansList = generate(1);

        for(List<Integer> ans : ansList){
            System.out.println(ans);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> firstTerm = new ArrayList<>();
        firstTerm.add(1);

        pascalsTriangle.add(firstTerm);
        if(numRows == 1){
            return pascalsTriangle;
        }

        for(int i = 1;i<numRows;i++){
            List<Integer> nthTerm = new ArrayList<>();
            nthTerm.add(1);
            if(i > 1){
                for(int j = 1;j<i;j++){
                    nthTerm.add(pascalsTriangle.get(i - 1).get(j-1)+pascalsTriangle.get(i - 1).get(j));
                }
            }
            nthTerm.add(1);
            pascalsTriangle.add(nthTerm);
        }
        return pascalsTriangle;
    }
}
