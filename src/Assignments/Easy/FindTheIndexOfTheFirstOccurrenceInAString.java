package Assignments.Easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        System.out.println("Find the Index of the First Occurrence in a String");
        System.out.println(strStr("leetcode","leeto"));
    }

    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
//        return -1;
    }
}
