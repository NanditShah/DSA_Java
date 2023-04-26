package Assignments.Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public static void main(String[] args) {
        System.out.println("Word Ladder");
    }

    class Pair{
        String word;
        int distance;

        public Pair(String word,int distance){
            this.word = word;
            this.distance = distance;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>();

        for(String word : wordList){
            set.add(word);
        }

        set.remove(beginWord);
        queue.add(new Pair(beginWord,1));

        while(!queue.isEmpty()){
            Pair removedPair  = queue.remove();

            String word = removedPair.word;
            int steps = removedPair.distance;

            if(word.equals(endWord) == true) return steps;

            for(int i = 0;i<word.length();i++){
                for(char ch = 'a'; ch <= 'z' ; ch++){
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if(set.contains(replacedWord) == true){
                        set.remove(replacedWord);
                        queue.add(new Pair(replacedWord,steps+1));
                    }
                }
            }
        }

        return 0;


    }
}
