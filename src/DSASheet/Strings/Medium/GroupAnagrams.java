package DSASheet.Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println("Group Anagrams");
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> anagrams = groupAnagrams(strs);
        System.out.println(anagrams);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hMap = new HashMap<>();

        for(int i =0;i<strs.length;i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if(!hMap.containsKey(sorted)){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hMap.put(sorted,list);
            }else{
                hMap.get(sorted).add(strs[i]);
            }
        }

        return new ArrayList<List<String>>(hMap.values());
    }
}
