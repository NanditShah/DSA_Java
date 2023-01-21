package Assignments.Easy;

public class CheckTwoStringArraysEquivalent {
    public static void main(String[] args) {
        System.out.println("Check If Two String Arrays are Equivalent");
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }
}
