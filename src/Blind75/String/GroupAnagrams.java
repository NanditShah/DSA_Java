package Blind75.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println("Group Anagrams");
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        if(strs.length == 0) return ans;

        HashMap<String,List<String>> dict = new HashMap<>();

        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            if(dict.containsKey(key)){
                dict.get(key).add(s);
            }else dict.put(key,new ArrayList<>(Arrays.asList(s)));
        }

        for(List<String> values : dict.values()) ans.add(values);

        return ans;
    }
}
