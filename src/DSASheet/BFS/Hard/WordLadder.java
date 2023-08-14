package DSASheet.BFS.Hard;

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        System.out.println("Word Ladder");
    }

    class Pair{
        String word;
        int distance;

        public Pair(String word, int distance) {
            this.word = word;
            this.distance = distance;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> helperQueue = new LinkedList<>();
        Set<String> distinctSet = new HashSet<>();

        for(String word : wordList) distinctSet.add(word);
        if(distinctSet.contains(beginWord)) distinctSet.remove(beginWord);
        if(!distinctSet.contains(endWord)) return 0;

        helperQueue.add(new Pair(beginWord,0));
        while(!helperQueue.isEmpty()){
            Pair topPair = helperQueue.remove();
            if(topPair.word.equals(endWord)) return (topPair.distance + 1);

            for(int i = 0;i<beginWord.length();i++){
                char[] charArr = topPair.word.toCharArray();
                for(char ch = 'a';ch <= 'z';ch++){
                    charArr[i] = ch;
                    String newWord = new String(charArr);
                    if(distinctSet.contains(newWord)){
                        distinctSet.remove(newWord);
                        helperQueue.add(new Pair(newWord,topPair.distance+1));
                    }
                }
            }
        }
        return 0;
    }
}
