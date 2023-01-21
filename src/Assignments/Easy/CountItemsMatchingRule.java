package Assignments.Easy;

import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        System.out.println("Count Items Matching a Rule");
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int indexToCheck = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        for(List<String> item : items){
            if(item.get(indexToCheck).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
