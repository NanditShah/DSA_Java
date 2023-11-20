package DP.Memo;

import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {
        System.out.println("Edit Distance");
    }

    public int minDistance(String word1, String word2) {
        if(word1.equals(word2)) return 0;
        int m = word1.length(), n = word2.length();

        int[][] memo = new int[m][n];

        for(int[] arr : memo) Arrays.fill(arr,-1);

        return calculate(word1,m - 1,word2, n - 1,memo);
    }

    public int calculate(String word1,int index1,String word2, int index2,int[][] memo){
        if(index1 < 0) return index2 + 1; // If word1 = "" num of operation required to make it to word2;
        if(index2 < 0) return index1 + 1; // If word2 = "" num of operations required to make word1 to "";

        if(memo[index1][index2] != -1) return memo[index1][index2];

        if(word1.charAt(index1) == word2.charAt(index2)) memo[index1][index2] = calculate(word1,index1 - 1,word2,index2 - 1,memo);
        else {
            int insert = 1 + calculate(word1, index1, word2, index2 - 1,memo);
            int delete = 1 + calculate(word1, index1 - 1, word2, index2,memo);
            int replace = 1 + calculate(word1, index1 - 1, word2, index2 - 1,memo);

            memo[index1][index2] = Math.min(insert, Math.min(delete, replace));
        }
        return memo[index1][index2];
    }

}
