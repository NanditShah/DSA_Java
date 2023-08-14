package DSASheet.DFS.Hard;

import java.util.*;

public class ConcatenatedWords {
    public static void main(String[] args) {
        System.out.println("Concatenated Words");
    }

    Set<String> hSet = new HashSet<>();
    HashMap<String,Boolean> dp = new HashMap<>();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for(String s : words) hSet.add(s);

        List<String> concatedWords = new ArrayList<>();
        for(String word : words){
            if(dfs(word)) concatedWords.add(word);
        }
        return concatedWords;
    }

    public boolean dfs(String word){
        if(dp.containsKey(word)) return dp.get(word);
        for(int i = 1;i<word.length();i++){
            String prefix = word.substring(0,i);
            String suffix = word.substring(i);
            if(hSet.contains(prefix) && (hSet.contains(suffix) || dfs(suffix))){
                dp.put(word,true);
                return true;
            }
        }
        dp.put(word,false);
        return false;
    }
}
