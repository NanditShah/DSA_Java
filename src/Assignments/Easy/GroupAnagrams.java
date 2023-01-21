package Assignments.Easy;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println("Group Anagrams");
        List<List<String>> ans = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        for(List<String> group : ans){
            System.out.println(Arrays.toString(group.toArray()));
        }
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(s);
            }else{
                List<String> strGroup = new ArrayList<>();
                strGroup.add(s);
                map.put(sortedStr,strGroup);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
