package Assignments.Graphs;

import java.util.*;

public class WordLadderII {
    public static void main(String[] args) {
        System.out.println("Word Ladder II");
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<ArrayList<String>> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>();


        for(String word : wordList){
            set.add(word);
        }

        set.remove(beginWord);

        ArrayList<String> ls = new ArrayList<>();
        ls.add(beginWord);
        queue.add(ls);

        ArrayList<String> usedOnLevel = new ArrayList<>();
        usedOnLevel.add(beginWord);
        int level = 0;
        List<List<String>> ans = new ArrayList<>();

        while(!queue.isEmpty()){
            ArrayList<String> removedList  = queue.remove();

            if(removedList.size() > level){
                level++;
                for(String it : usedOnLevel){
                    set.remove(it);
                }
            }

            String word = removedList.get(removedList.size() - 1);
            int steps = removedList.size();

            if(word.equals(endWord) == true) {
                if(ans.size() == 0) ans.add(removedList);
                else if(ans.get(0).size() == removedList.size()) ans.add(removedList);
            }
            for(int i = 0;i<word.length();i++){
                for(char ch = 'a'; ch <= 'z' ; ch++){
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if(set.contains(replacedWord) == true){
                        removedList.add(replacedWord);
                        ArrayList<String> temp = new ArrayList<>(removedList);
                        queue.add(temp);
                        usedOnLevel.add(replacedWord);
                        removedList.remove(removedList.size() - 1);
                    }
                }
            }
        }
        return ans;


    }
}
