package Assignments.Easy;

public class LastMomentBeforeAllAntsFallOutOfAPlank {
    public static void main(String[] args) {
        System.out.println("Last Moment Before All Ants Fall Out of a Plank");
    }

    public int getLastMoment(int n, int[] left, int[] right) {
        int time = 0;
        for(int lAnt : left)
            time = Math.max(time,lAnt);

        for(int rAnt : right)
            time = Math.max(time,n - rAnt);

        return time;
    }
}
