package Assignments.Easy;

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        System.out.println("Maximum Number of Words Found in Sentences");
    }

    static int mostWordsFound(String[] sentences) {
        int maxWordCount = 0;
        for(String sentence : sentences){
            if(maxWordCount < sentence.split(" ").length){
                maxWordCount = sentence.split(" ").length;
            }
        }
        return maxWordCount;
    }
}
