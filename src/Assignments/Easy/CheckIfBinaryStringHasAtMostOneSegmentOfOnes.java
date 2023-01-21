package Assignments.Easy;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        System.out.println("Check if Binary String Has at Most One Segment of Ones");
        String s = "1";
        System.out.println(checkOnesSegment(s));
    }

    static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
