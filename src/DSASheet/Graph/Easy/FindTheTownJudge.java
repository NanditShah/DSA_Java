package DSASheet.Graph.Easy;

public class FindTheTownJudge {
    public static void main(String[] args) {
        System.out.println("Find the Town Judge");
        int[][] array = {
                {1, 3},
                {2, 3}
        };
        int actualTownJudge = findJudge(3,array);
        System.out.println(actualTownJudge);
    }

    public static int findJudge1(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int person = 0; person < count.length; person++) {
            if (count[person] == n - 1) return person;
        }
        return -1;
    }

    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;

        int[] count = new int[n+1];
        for(int[] person : trust){
            count[person[0]] --;
            count[person[1]] ++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == n - 1) return i;
        }
        return -1;
    }
}
