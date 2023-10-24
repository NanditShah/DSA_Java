package Grind75;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        System.out.println("Top K Frequent Words");
    }





    class WordFrequency extends Object implements Comparable<WordFrequency>{
        String word;
        int frequency;

        public WordFrequency(String word, int frequency) {
            this.word = word;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(WordFrequency o) {
            int frequencyComparison = Integer.compare(o.frequency, this.frequency);

            if (frequencyComparison == 0) {
                return this.word.compareTo(o.word);
            }

            return frequencyComparison;
        }
    }


    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hMap = new HashMap<>();

        for(String word : words){
            hMap.put(word,hMap.getOrDefault(word,0)+1);
        }

        PriorityQueue<WordFrequency> heap = new PriorityQueue<>();

        for(Map.Entry<String,Integer> entry : hMap.entrySet()){
            heap.add(new WordFrequency(entry.getKey(),entry.getValue()));
        }

        List<String> ans = new ArrayList<>();

        while(k > 0){
            ans.add(heap.remove().word);
            k--;
        }

        return ans;
    }
}

