package Learning.Recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println("Print all the sub sequences off Given string");
//        getAllSubSeq("","abc");
        System.out.println(getAllSubSeqList("","abc"));
    }

    static void getAllSubSeq(String processed,String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char charToBeProcessed = unProcessed.charAt(0);
        getAllSubSeq(processed,unProcessed.substring(1));
        getAllSubSeq(processed+charToBeProcessed,unProcessed.substring(1));
    }

    static ArrayList<String> getAllSubSeqList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }
        char charToBeProcessed = unProcessed.charAt(0);
        ArrayList<String> left = getAllSubSeqList(processed,unProcessed.substring(1));
        ArrayList<String> right = getAllSubSeqList(processed+charToBeProcessed,unProcessed.substring(1));

        left.addAll(right);
        return left;
    }

}
