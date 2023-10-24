package Grind75;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println("Generate Parentheses");

        List<String> ans = generateParenthesis(1);
        System.out.println(ans);
    }


    static List<String> ans = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        generate(n,0,0,"");
        return ans;
    }

    public static void generate(int n,int noOfOpening,int noOfClosing,String processed){
        if(processed.length() == 2 * n) ans.add(processed);

        if(noOfOpening < n)
            generate(n,noOfOpening+1,noOfClosing,processed+"(");

        if(noOfClosing < noOfOpening)
            generate(n,noOfOpening,noOfClosing+1,processed+")");

    }
}
