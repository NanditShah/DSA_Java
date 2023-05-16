package Learning.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println("Permutation");
//        permutationOfString("","abc");
        List<String> permutationList = permutationStringList("","abc");
        System.out.println(permutationList);
    }

    static void permutationOfString(String processed,String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char characterToBeProcessed = unProcessed.charAt(0);

        for(int i = 0;i<=processed.length();i++){
            String stringToBeProcessed = processed.substring(0,i)+characterToBeProcessed+processed.substring(i);
            permutationOfString(stringToBeProcessed,unProcessed.substring(1));
        }

    }

    static List<String> permutationStringList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(processed);
            return ans;
        }

        List<String> ans = new ArrayList<>();
        char characterToBeProcessed = unProcessed.charAt(0);

        for(int i = 0;i<=processed.length();i++){
            String stringToBeProcessed = processed.substring(0,i)+characterToBeProcessed+processed.substring(i);
            ans.addAll(permutationStringList(stringToBeProcessed,unProcessed.substring(1)));
        }
        return ans;

    }

}
